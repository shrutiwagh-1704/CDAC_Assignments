import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;

    static int totalEmployees = 0;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        totalEmployees++;
    }

    // Salary calculation (basic only)
    double calculateSalary() {
        return basicSalary;
    }

    // Salary calculation with one allowance
    double calculateSalary(double allowance) {
        return basicSalary + allowance;
    }

    // Salary calculation with multiple allowances
    double calculateSalary(double hra, double da) {
        return basicSalary + hra + da;
    }

    void displayDetails(double finalSalary) {
        System.out.println("\n------ Employee Details ------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Final Salary: " + finalSalary);
        System.out.println("------------------------------");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Basic Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        System.out.println("\nTotal Employees: " + Employee.totalEmployees);

        System.out.println("\n========= Employee Salary Report =========");
        for (int i = 0; i < n; i++) {

            // Example usage of overloading
            double finalSalary;

            if (i % 3 == 0) {
                finalSalary = employees[i].calculateSalary(); // basic only
            } 
            else if (i % 3 == 1) {
                finalSalary = employees[i].calculateSalary(2000); // one allowance
            } 
            else {
                finalSalary = employees[i].calculateSalary(3000, 1500); // hra + da
            }

            employees[i].displayDetails(finalSalary);
        }

        sc.close();
    }
}