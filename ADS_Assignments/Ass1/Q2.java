public class Q2 {
    static int fib(int a)
    {
        if(a==0 || a==1)
        {
            return a;

        }
        else
        {
            return (fib(a-1)+fib(a-2));
        }

    }
    public static void main(String[] args) {
        int res=Q2.fib(5);
        System.out.println(res);
        
    }
}
