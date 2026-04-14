import java.util.*;

class ContactDetails {
    String phone;
    String email;

    ContactDetails(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }
}

class Student {
    int rollNo;
    String name;
    int[] marks;
    ContactDetails contact;

    static int totalStudents = 0;

    Student(int rollNo, String name, int[] marks, ContactDetails contact) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.contact = contact;
        totalStudents++;
    }

    int totalMarks() {
        int total = 0;
        for (int m : marks)
            total += m;
        return total;
    }

    double averageMarks() {
        if (marks.length == 0) return 0;
        return (double) totalMarks() / marks.length;
    }

    void displayReport() {
        System.out.println("\n------ Student Report ------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);

        System.out.print("Marks   : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println("\nTotal   : " + totalMarks());
        System.out.println("Average : " + averageMarks());

        System.out.println("Phone   : " + contact.phone);
        System.out.println("Email   : " + contact.email);
        System.out.println("----------------------------");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Student " + (i + 1) + " details:");

            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Number of subjects: ");
            int subCount = sc.nextInt();

            int[] marks = new int[subCount];
            for (int j = 0; j < subCount; j++) {
                System.out.print("Marks of subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            sc.nextLine();

            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            ContactDetails cd = new ContactDetails(phone, email);

            students[i] = new Student(roll, name, marks, cd);
        }

        System.out.println("\n========= All Student Reports =========");
        for (int i = 0; i < n; i++) {
            students[i].displayReport();
        }

        System.out.println("\nTotal Students Admitted: " + Student.totalStudents);

        sc.close();
    }
}