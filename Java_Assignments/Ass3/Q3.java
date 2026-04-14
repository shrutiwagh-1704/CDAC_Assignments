import java.util.Scanner;

class BankAccount {
    private int accNo;
    private String holderName;
    private double balance;

    static int totalAccounts = 0;

    BankAccount(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit using cash
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Cash Deposit Successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Deposit using online mode (Overloaded)
    void deposit(double amount, String mode) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(mode + " Deposit Successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount!");
        } 
        else if (amount > balance) {
            System.out.println("Withdrawal Failed! Insufficient Balance.");
        } 
        else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful: " + amount);
        }
    }

    void displayAccountDetails() {
        System.out.println("\n------ Account Details ------");
        System.out.println("Account No   : " + accNo);
        System.out.println("Holder Name  : " + holderName);
        System.out.println("Balance      : " + balance);
        System.out.println("------------------------------");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts to create: ");
        int n = sc.nextInt();
        sc.nextLine();

        BankAccount[] accounts = new BankAccount[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1));

            System.out.print("Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Initial Balance: ");
            double bal = sc.nextDouble();

            accounts[i] = new BankAccount(accNo, name, bal);
        }

        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);

        // Performing deposit & withdraw for first account (demo)
        System.out.println("\n--- Transactions on Account 1 ---");

        accounts[0].deposit(5000); // cash deposit
        accounts[0].deposit(2000, "Online"); // online deposit
        accounts[0].withdraw(3000);
        accounts[0].withdraw(100000); // insufficient balance test

        // Display all accounts
        System.out.println("\n========= All Account Details =========");
        for (int i = 0; i < n; i++) {
            accounts[i].displayAccountDetails();
        }

        sc.close();
    }
}
