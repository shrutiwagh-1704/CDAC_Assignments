
import java.util.*;

class Payment
{
    int PaymentID;
    double amount;

   
    void displayPayment()
    {
        System.out.println("paymentID: "+PaymentID);
        System.out.println("amount: "+amount);
        System.out.println("-----");
    }
}

class CreditCardPayment extends Payment
{
    CreditCardPayment (int PaymentID,double amount)
    {
        this.PaymentID=PaymentID;
        this.amount=amount;

    }

    void displayPayment()
    {
        System.out.println("CreditCard Payment ");
        System.out.println("-----");
        super.displayPayment();
    }
}

class UPIPayment extends Payment
{
    UPIPayment(int PaymentID,double amount)
    {
        this.PaymentID=PaymentID;
        this.amount=amount;
    }
    void displayPayment()
    {
        System.out.println("UPIPayment ");
        System.out.println("-----");
        super.displayPayment();
    }
}



public class Q4 {
    public static void DisplayPayment(List<? extends Payment> list)
    {
        for(Payment p:list)
        {
            p.displayPayment();

        }
    }

    public static void main(String[] args) {
        List<CreditCardPayment> cl1=new ArrayList<>();
        cl1.add(new CreditCardPayment(1, 5000));
        cl1.add(new CreditCardPayment(2,10000));
        cl1.add(new CreditCardPayment(3,40000));
        cl1.add(new CreditCardPayment(2,20000));

        List<UPIPayment> pl1=new ArrayList<>();
        pl1.add(new UPIPayment(1, 5789));
        pl1.add(new UPIPayment(2, 20000));
        pl1.add(new UPIPayment(3, 80000));
        pl1.add(new UPIPayment(4, 30000));

        DisplayPayment(cl1);
        DisplayPayment(pl1);




        

    }
}
