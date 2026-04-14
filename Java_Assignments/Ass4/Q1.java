package Ass4;
import java.util.*;

class Product
{
    int ProductId;
    String ProductName;
    String Price;
    double price_dbl;

    Product(Scanner sc)
    {
        System.out.println("Enter the ProductId: ");
        this.ProductId=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the ProductName: ");
        this.ProductName=sc.nextLine();

        System.out.println("Enter the Price: ");
        this.Price=sc.nextLine();

        converttoDouble();
    }

    void converttoDouble()
    {
        price_dbl=Double.parseDouble(Price);
    }
}

class Order
{
    String CustomerName;
    int n;
    double total;
    double final_Total;

    Product[] product_arr;

    void makeOrder(Scanner sc)
    {
        System.out.println("Enter the Customer Name: ");
        this.CustomerName=sc.nextLine();

        System.out.println("Enter NUmber of Products you buyed: ");
        this.n=sc.nextInt();

        product_arr=new Product[n];

        System.out.println("Enter product Details:");
        for(int i=0;i<n;i++)
        {
            product_arr[i]=new Product(sc);
        }

        
    }

    double calculatetotalBill()
        {
            for(int i=0;i<n;i++)
            {
                total+=product_arr[i].price_dbl;
            }

            return total;
        }

    double calculatetotalBill(int dis)
    {
        final_Total=total-(total*(dis/100.0));
        return final_Total;
    } 
    
    void generateBill(int dis)
    {
        StringBuilder sb=new StringBuilder();
        sb.append("CustomerName: "+this.CustomerName);
        // System.out.println("CutomErName: "+sb);

        sb.append("\n------------------------------------------\n");
        sb.append("ProductName              Price\n");
        sb.append("------------------------------------------\n");
        for(int i=0;i<n;i++)
        {
            // -15 means right mai space aad hogi and it is left align
            sb.append(String.format("%-20s %-15s\n",product_arr[i].ProductName,product_arr[i].price_dbl));
           
        
        }
        sb.append("\n------------------------------------------\n");
        sb.append("Total: "+ calculatetotalBill());
        sb.append("\n------------------------------------------\n");
        sb.append("Total After Discount: "+ dis + "% "+ calculatetotalBill(dis));

        System.out.println(sb);

    }

}

interface payment
{
    void pay(double amount);
    void refund(double amount);

}

class UPIPayment implements payment{
    public void pay(double amount)
    {
        System.out.println("Total Amount "+ amount+ " paid using UPIPayment");
    }

    public void refund(double amount)
    {
        System.out.println("Total Amount refunded "+ amount + " by UPIPayment ");
    }
}


class CardPayment implements payment{
    public void pay(double amount)
    {
        System.out.println("Total Amount "+ amount+ " paid using CardPayment");
    }

    public void refund(double amount)
    {
        System.out.println("Total Amount refunded "+ amount + " by CardPayment ");
    }
}


public class Q1 {
    public static void main(String[] args) {
        // if calculateBill is greater than 5000 then only override \
        try
        {
            Scanner sc =new Scanner(System.in);

            Order o1=new Order();
            int dis;
            o1.makeOrder(sc);
            System.out.println("Enter the discount: ");
            dis=sc.nextInt();
            sc.nextLine();
            
           
            o1.generateBill(dis);
            double finalTotal=o1.calculatetotalBill(dis);
             System.out.println(finalTotal);


        
            System.out.println("Choose Payment methods: ");
            System.out.println("1.UPIPayment");
            System.out.println("2.CardPayment: ");

            int choice;
            System.out.println("ENter choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            payment payment;

            switch(choice)
            {
                case 1:
                    {
                        payment=new UPIPayment();
                        break;
                    }

                case 2:
                    {
                        payment=new CardPayment();
                        break;
                    }
                default:
                    {
                        throw new IllegalArgumentException("Invalid choice..");

                    }
            }

            int action;
            System.out.println("Enter what you wanted do : ");
            System.out.println("1.Pay");
            System.out.println("2.Refund");
            System.out.println("Enter Action:");
            action =sc.nextInt();
            sc.nextLine();

            switch(action)
            {
                case 1:
                    {
                        payment.pay(finalTotal);
                        break;
                    }
                case 2:
                    {
                        payment.refund(finalTotal);
                        break;
                    }
                default:
                {
        
                    throw new IllegalArgumentException("Invalid choice..");
                }
            }

        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Price...");
        }

        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
       
    
}

