import java.util.*;
class Mobile_Recharge
{
    long MobileNo;
    int planNo;
    String plan;

    void SetData(long MobileNo,int choice)
    {
        this.MobileNo=MobileNo;
        this.planNo=choice;

   }

   void PrintPlan()
   {
    if(planNo==1)
    {
        System.out.println("Your Recharge For plan of Rs.199 on " + MobileNo+" is Successfull Enjoy plan for 28 days with 1GB data per day and Unlimited msgs and voice calls..");
    }
    else if(planNo==2)
    {
        System.out.println("Your Recharge For plan of Rs.399 on " + MobileNo+" is Successfull Enjoy plan for 56 days with 1.5GB data per day and Unlimited msgs and voice calls..");
    }
    else if(planNo==3)
    {
        System.out.println("Your Recharge For plan of Rs.599 on " + MobileNo+" is Successfull Enjoy plan for 84 days with 2GB data per day and Unlimited msgs and voice calls..");
    }
   }


}

public class Q7 {
    public static void main(String[] args) {
        int choice=0;
        Scanner sc=new Scanner(System.in);
         Mobile_Recharge m1= new Mobile_Recharge();

        long MobileNo;
        // int plan;

        System.out.println("1.Rs.199 -28 days Validity..");
        System.out.println("2.RS.399-56 days validity..");
        System.out.println("3.599-84 days validity..");

        System.out.println("Select Plan: ");
        choice=sc.nextInt();

        switch (choice) {
            case 1:
                {
                    System.out.println("1.Rs.199 -28 days Validity..");
                    
                    break;

                }

            case 2:
                {
                    System.out.println("2.RS.399-56 days validity..");
                    break;
                }

            case 3:
                {
                    System.out.println("3.599-84 days validity..");
                    break;
                }
                
        
            default:
                {
                    System.out.println("Enter valid choice..");
                    break;
                }
               
        }

        System.out.println("Enter the MobileNo: ");
        MobileNo=sc.nextLong();
        sc.nextLine();
        m1.SetData(MobileNo,choice);
        m1.PrintPlan();

        
    }
}
