import java.util.Scanner;

class ElectricityBill
{
    String customerName;
    int consumerNum;
    int units;

    void Acceptdata(String customerName,int consumerNum,int units)
    {
        this.customerName=customerName;
        this.consumerNum=consumerNum;
        this.units=units;

        this.calculatebill(units);


    }

    void calculatebill(int units)
    {
        int tempUnits=units;
        int TotalBill=0;

        if(tempUnits>100)
        {
            TotalBill+=100*5;
            tempUnits-=100;
         
            if(tempUnits>100)
            {
                TotalBill+=100*7;
                tempUnits-=100;
                
            }
            else 
            {
                TotalBill+=tempUnits*7;
                tempUnits=0;
            }
            // if after 2 100s remains something then 
            if(tempUnits>0)
            {
                TotalBill+=tempUnits*10;
                
            }
        }

        else
        {
            TotalBill+=tempUnits*5;
        }
    
        if(TotalBill>1500)
        {
            TotalBill+=TotalBill*0.05;
            
        }
        System.out.println("*********************************************************");
        System.out.println("customerName: "+customerName);
        System.out.println("consumerNumber: "+consumerNum);
        System.out.println("TotalUnits consume"+ units);
        System.out.println("TotalBill is: "+TotalBill);
        System.out.println("*********************************************************");
    }

}

public class Q1
{
    public static void main(String[] args) {
        ElectricityBill B=new ElectricityBill();

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the Name: ");
        String customerName=sc.nextLine();

        System.out.println("Enter the consumerNUmber: ");
        int consumerNum=sc.nextInt();

        System.out.println("Enter the Units: ");
        int units=sc.nextInt();

        B.Acceptdata(customerName, consumerNum, units);

        
    }
}