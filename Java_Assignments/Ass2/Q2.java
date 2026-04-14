import java.util.Scanner;

class Students
{
    String name;
    int rollNo;
    int[] marks =new int[5];
    int total=0;
    double average;
    double percentage;
    String Grade;

    void acceptdata(String name,int rollNo,int[] marks)
    {
        this.name=name;
        this.rollNo=rollNo;

        this.marks=marks;   //reference copy same array pointing

        this.total();
        this.average();
        this.percentage();
        this.calculateGrade();
    }

    int total()
    {
       
        for(int i=0;i<5;i++)
        {
            total+=marks[i];
        }
        return total;
    }

    void  average()
    {
         average=total/5;
    }

    void  percentage()
    {
        percentage=(double) total/500 *100;
    }

    void calculateGrade()
    {
        if(percentage>=90)
        {
             Grade="A";
        }
        else if(percentage>=75 && percentage<=89)
        {
             Grade="B";
        }
        else if(percentage>=60 && percentage<=74)
        {
            Grade="C";
        }
        else if(percentage>=40 && percentage<=59)
        {
             Grade="D";
        }
        else
        {
             Grade="Fail";
        }
    }

    void printData()
    {
        System.out.println("Name of Student is: "+name);
        System.out.println("RollNo of Student is: "+rollNo);
        System.out.println("The Total marks student got are: "+ total);
        System.out.println("Average marks of student is: "+average);
        System.out.println("Percentage:"+percentage);
        System.out.println("Grade is: "+ Grade);

    }

}

public class Q2 {
    public static void main(String[] args) {
        Students s=new Students();
        Scanner sc =new Scanner(System.in);

        int[] marks=new int[5];
       
       

        System.out.println("Enter the Name of Student..");
        String name = sc.nextLine();

        System.out.println("Enter the rollno.");
        int rollNo =sc.nextInt();

        System.out.println("Enter the marks..");
        for(int i=0;i<5;i++)
        {
            marks[i]=sc.nextInt();
        }

        s.acceptdata(name, rollNo, marks);
        s.printData();
    }
}
