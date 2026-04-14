
import java.util.*;
class Course
{
    int courseID;
    String CourseName;
    double fees;

    Course(int courseID,String CourseName,double fees)
    {
        this.courseID=courseID;
        this.CourseName=CourseName;
        this.fees=fees;

    }
}

class Student
{
    int No_of_Courses;
    String Name;

    Course enrolledCourses[];
    int enrolledCount=0;

    Student(int No_of_Courses,String Name)
    {
        this.No_of_Courses=No_of_Courses;
        this.Name=Name;
        enrolledCourses=new Course[No_of_Courses];

        
    }

    void enrollCourse(Course c) {
        if (enrolledCount < enrolledCourses.length) {
            enrolledCourses[enrolledCount] = c;
            enrolledCount++;
            System.out.println(Name + " enrolled in " + c.CourseName);
        } else {
            System.out.println("Course limit reached for " + Name);
        }
    }
    
    void display() {
        System.out.println("\nStudent: " + Name );
        System.out.println("Enrolled Courses:");

        for (int i = 0; i < enrolledCount; i++) {
            System.out.println(enrolledCourses[i].courseID + " "
                    + enrolledCourses[i].CourseName + " Fees: " + enrolledCourses[i].fees);
        }
    }

    

}

public class Q9 
{
    public static void main(String[] args) 
    {

        System.out.println("Enter the No. of Courses: ");
        Scanner sc=new Scanner(System.in);
        int totalCourse=sc.nextInt();

        Course c1[]=new Course[totalCourse];

        for(int i=0;i<totalCourse;i++)
        {
            System.out.println("Enter courseID: ");
            int courseID=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter courseName: ");
            String CourseName=sc.nextLine();

            System.out.println("Enter the fees: ");
            double fees =sc.nextDouble();

            c1[i]=new Course(courseID, CourseName, fees);

        }

        System.out.println("CourseList: ");
        for(int i=0;i<totalCourse;i++)
        {
            System.out.print(i+1+" ");
            System.out.println(c1[i].CourseName);
        }

        Student s1=new Student(1,"Shruti");

        System.out.println("Enter index for course: ");
        int index=sc.nextInt();

        s1.enrollCourse(c1[index -1]);
        s1.display();
        // Course c=new Course();

        
    }
}
