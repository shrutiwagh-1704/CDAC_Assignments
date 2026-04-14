import java.util.*;



class Report
{
    static <T> void GenerateReport(List<T> list)
    {
        for(T item:list)
        {
            System.out.println(item);
        }
    }
}


public class Q2 {
    public static void main(String[] args) {
        List<Number> sales=new ArrayList<>();
        sales.add(10);
        sales.add(11);
        sales.add(16);
        sales.add(15.44f);
        sales.add(20.00);

        Report.GenerateReport(sales);

        List<String> EmpName=new ArrayList<>();
        EmpName.add("Shruti");
        EmpName.add("Shreya");
        EmpName.add("Gauri");
        Report.GenerateReport(EmpName);

        List<Integer> ProductID=new ArrayList<>();
        ProductID.add(11);
        ProductID.add(22);
        ProductID.add(33);
        Report.GenerateReport(ProductID);



    }
}
