import java.util.Scanner;

class ATM_Machine
{

    float balance=500.0f;

    void checkBalance()
    {
        System.out.println("Available Balance is: "+balance);
    }

    void DepositMoney(float d)
    {
        if(d>=0)
        {
            balance+=d;
            System.out.println("Money Deposited Successfully..");
        }
        else
        {
            System.out.println("Invalid Money..");
        }
        
    }

    void Withdraw(float w)
    {
        if(w<balance & w>0)
        {
            balance-=w;
            System.out.println("Money Withdrwal is successfull ..cllect amount"+w);
        }
        else if(w<0)
        {
            System.out.println("Invalid Amount..");
        }
        else
        {
            System.out.println("Not sufficient Balance to withdraw money..");
        }
    }



}

public class Q3
{
    public static void main(String arg[])
    {
        ATM_Machine a1=new ATM_Machine();
        

        int choice=0;
        Scanner sc = new Scanner(System.in);
        
        while(choice<4)
        {
            System.out.println("1.Check Balance..");
            System.out.println("2.Deposit Money..");
            System.out.println("3.Withdraw Money..");
            System.out.println("4.Exit");

            System.out.println("Enter the choice..");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                {
                    a1.checkBalance();
                   
                    break;
                }

                case 2:
                {
                    System.out.println("Enter money to deposit..");
                    float deposit=sc.nextFloat();
                    a1.DepositMoney(deposit);

                    break;
                }

                case 3:
                {
                    System.out.println("Enter money to withdraw..");
                    float w=sc.nextFloat();
                    a1.Withdraw(w);
                
                    break;
                }

                case 4:
                {
                    System.out.println("Exit from System..");
                    break;
                }
            }
        }
    }
}