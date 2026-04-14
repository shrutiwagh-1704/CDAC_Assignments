import java.util.Scanner;

class ContactDetails {
    String phone;
    String email;

    ContactDetails(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }
}

class Patient {
    int patientId;
    String name;
    int age;
    String disease;
    ContactDetails contact; // composition

    static int totalPatients = 0;

    Patient(int patientId, String name, int age, String disease, ContactDetails contact) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.contact = contact;
        totalPatients++;
    }

    boolean isSeniorCitizen() {
        return age >= 60;
    }

    void displayDetails() {
        System.out.println("\n------ Patient Details ------");
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Disease    : " + disease);
        System.out.println("Phone      : " + contact.phone);
        System.out.println("Email      : " + contact.email);

        if (isSeniorCitizen())
            System.out.println("Status     : Senior Citizen");
        else
            System.out.println("Status     : Normal Patient");

        System.out.println("------------------------------");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        Patient[] patients = new Patient[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Patient " + (i + 1));

            System.out.print("Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Disease: ");
            String disease = sc.nextLine();

            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            ContactDetails cd = new ContactDetails(phone, email);
            patients[i] = new Patient(id, name, age, disease, cd);
        }

        System.out.println("\nTotal Patients Admitted: " + Patient.totalPatients);

        System.out.println("\n========= Patient Records =========");
        for (int i = 0; i < n; i++) {
            patients[i].displayDetails();
        }

        sc.close();
    }
}