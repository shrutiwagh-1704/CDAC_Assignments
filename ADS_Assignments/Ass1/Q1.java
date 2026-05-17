import java.util.*;

public class Q1
{
    static int fact(int a)
    {
        if(a<0)
        {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        else if(a==0 || a==1)
        {
            return 1;
        }
        else
        {
            return a * fact(a-1);
        }
        // return 0;
    }
    public static void main(String[] args) {

        int res = Q1.fact(-3);
        System.out.println(res);
    }
}