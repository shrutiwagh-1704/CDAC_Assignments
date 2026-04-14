import java.util.Scanner;

class Employee_Salary_slip
{
    double basicSalary;
    String name;
    int ID;
    double HRA;
    double DA;
    double Pf;
    double NetSalary;

    double HRAAmount;
    double DAAmount;
    double PfAmount;

    void Acceptdata(double basicSalary,String name,int ID)
    {
        this.basicSalary=basicSalary;
        this.name=name;
        this.ID=ID;


    }

    void calculateSalary()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the HRA: ");
        HRA=sc.nextDouble();
        HRA=HRA/100;

        sc.nextLine();

        System.out.println("Enter the DA: ");
        DA=sc.nextDouble();
        DA=DA/100;
        sc.nextLine();

        System.out.println("Enter the pf: ");
        Pf=sc.nextDouble();
        Pf=Pf/100;
        sc.nextLine();

        HRAAmount=basicSalary*HRA;
        DAAmount=basicSalary*DA;
        PfAmount=basicSalary*Pf;

        NetSalary=basicSalary+HRAAmount+DAAmount-PfAmount;
    
    }

    void PrintSalary()
    {
        System.out.println("***************************************************");
        System.out.println("Name: "+name);
        System.out.println("EmployeeID: "+ID);
        System.out.println("BasicSalary: "+basicSalary);

        System.out.println("------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s\n","Earnings","Amount","Deduction","DeductionAmount");
        System.out.println("---------------------------------------------------------------------");

        System.out.printf("%-15s %-15.2f %-15s %-15.2f\n","basicSalary",basicSalary,"PF",PfAmount);
        System.out.printf("%-15s %-15.2f\n","HRA",HRA);
        System.out.printf("%-15s %-15.2f\n ","DA",DA);

        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-15s %-15.2f %-15s %-15.2f\n","Total",basicSalary+HRAAmount+DAAmount,"Total",PfAmount);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("NetPay: "+NetSalary);


    }
}

class Q5
{
    public static void main(String[] args) {
        Employee_Salary_slip p1=new Employee_Salary_slip();
        Scanner sc =new Scanner(System.in);

        double basicSalary;
        String name;
        int ID;

        System.out.println("Enter the basicSalary: ");
        basicSalary=sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the name: ");
        name=sc.nextLine();

        System.out.println("Enter the ID:");
        ID=sc.nextInt();
        sc.nextLine();

        p1.Acceptdata(basicSalary,name,ID);
        p1.calculateSalary();
        p1.PrintSalary();
    }
}