import java.util.Scanner;

class GroceryBill
{
    int n;
    String [] items;
    int[] Quantity;
    int[] price;
    int sum=0;
    int finalBill=0;


    GroceryBill(int n)
    {
        this.n=n;
        items=new String[n];
        Quantity = new int[n];
        price=new int[n];




    }
    

    void Acceptdata()
    {
        // this.n=n;
        // this.items=items;
        // this.Quantity=Quantity;
        // this.price=price;
        System.out.println("Enter details here......");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter item:");
            items[i]=sc.nextLine();

            System.out.println("ENter Quantity: ");
            Quantity[i]=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the price: ");
            price[i]=sc.nextInt();
            sc.nextLine();
        }
    }

    void GenerateBill()
    {
        int[] total=new int[n];
        for(int i=0;i<n;i++)
        {
            total[i]=price[i]*Quantity[i];
        }

        for(int j=0;j<n;j++)
        {
            sum+=total[j];

        }
        if(sum>3000)
        {
            finalBill=(sum-(int)(sum*0.1));
        }

        System.out.println("***********************************************");
        System.out.printf("%-10s %-10s %-10s %-10s\n","Items","Qauntity","price","total");
        System.out.println("--------------------------------------------------");
        for(int k=0;k<n;k++)
        {
        //    System.out.println(items[k]+"           "+Quantity[k]+"           "+price[k]+"           "+total[k]);
        System.out.printf("%-10s %-10d %-10d %-10d\n",items[k],Quantity[k],price[k],total[k]);

        }
        System.out.println("--------------------------------------------------");
        System.out.println("TOTAL:"+sum);
        if(sum>3000)
        {
            System.out.println("--------------------------------------------------");
            System.out.println("discount  "+finalBill);
        }
    }



}

public class Q4 {
    public static void main(String[] args) {
        
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many Items you buyed..");
        n=sc.nextInt();
        sc.nextLine();

        GroceryBill b1=new GroceryBill(n);

        
        
        

        // for(int i=0;i<n;i++)
        // {
        //     System.out.println("Enter item:");
        //     items[i]=sc.nextLine();

        //     System.out.println("ENter Quantity: ");
        //     Quantity[i]=sc.nextInt();
        //     sc.nextLine();

        //     System.out.println("Enter the price: ");
        //     price[i]=sc.nextInt();
        //     sc.nextLine();
        // }

        b1.Acceptdata();
        b1.GenerateBill();
      
    }
}
