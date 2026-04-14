import java.util.*;

class Financial_Calculator
{
    double Sum;
    double Average;

    <T extends Number> void Total_cal(List<T> l)
    {
        Sum=0;
        for(T elmts:l)
        {
            Sum+=elmts.doubleValue();
        }
        System.out.println("sum is: "+Sum);
        
    }

    <T extends Number> void Total_avg(List<T> l)
    {
        int size=l.size();
        Average=Sum/size;

        System.out.printf("Average is: %.2f", Average);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Financial_Calculator f1=new Financial_Calculator();
        List<Double> l1=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.print("How many elmts you want to enter: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double value = sc.nextDouble();
            l1.add(value);
        }

      

        f1.Total_cal(l1);
        f1.Total_avg(l1);


    }
}
