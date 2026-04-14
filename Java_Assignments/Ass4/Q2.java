// package Ass4;

import java.util.*;

class Account {
    int AccountNumber;
    String AccountHolderName;
    double balance;

    Account() {

    }

    Account(Scanner sc) {
        System.out.println("Enter Detail: ");
        System.out.println("Enter the Account Number: ");
        AccountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the AccounHolderName: ");
        AccountHolderName = sc.nextLine();

        System.out.println("Enter the balance: ");
        balance = Double.parseDouble(sc.nextLine());

    }

    void accountSummary() {
        // bal
        StringBuilder sb = new StringBuilder();

        sb.append("AccountHolderName: " + AccountHolderName + "\n")
                .append("AccountNumber: " + AccountNumber + "\n")
                .append("Remianing Balance: " + balance + "\n");

        System.out.println(sb);

    }
}

interface BankService {
    void deposit(double amt);

    void withdraw(double amt);

}

class SavingAccount extends Account implements BankService {

    SavingAccount(Scanner sc) {
        super(sc);
    }

    void DisplyAccountDetails() {
        System.out.println("This is SavingAccount: ");

    }

    public void deposit(double amt) {

        try {
            if (amt <= 0) {
                throw new IllegalArgumentException();
            }

            else {
                this.balance += amt;
                System.out.println("Balance Updated SuccessFully in SavingAccount..");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Amount Enter..");
        }

    }

    public void deposit(double amt, double bonus) {

        try {
            if (amt <= 0 || bonus < 0) {
                throw new IllegalArgumentException();
            }

            else {
                this.balance += amt + bonus;
                System.out.println("Balance Updated SuccessFully in Saving Account..");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Amount Enter..");
        }

    }

    public void withdraw(double amt) {

        try {
            if (amt >= balance || amt <= 0) {
                throw new IllegalArgumentException();
            } else {
                this.balance = this.balance - amt;
                System.out.println("Withdraw amount successfully from SavingAccount..: " + amt);
            }
        } catch (IllegalArgumentException e) {

            System.out.println("Invalid Ammount Enter..");
        }
    }
}

class CurrentAccount extends Account {

    CurrentAccount(Scanner sc) {
        super(sc);
    }

    void DisplyAccountDetails() {
        System.out.println("This is CurrentAccount: ");

    }

    public void deposit(double amt) {

        try {
            if (amt <= 0) {
                throw new IllegalArgumentException();
            }

            else {
                this.balance += amt;
                System.out.println("Balance Updated SuccessFully in CurrentAccount..");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Amount Enter..");
        }

    }

    public void deposit(double amt, double bonus) {

        try {
            if (amt <= 0 || bonus < 0) {
                throw new IllegalArgumentException();
            }

            else {
                this.balance += amt + bonus;
                System.out.println("Balance Updated SuccessFully in CurrentAccount..");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Amount Enter..");
        }

    }

    public void withdraw(double amt) {

        try {
            if (amt >= balance || amt <= 0) {
                throw new IllegalArgumentException();
            } else {
                this.balance = this.balance - amt;
                System.out.println("Withdraw amount successfully from CurrentAccount..: " + amt);
            }
        } catch (IllegalArgumentException e) {

            System.out.println("Invalid Ammount Enter..");
        }
    }

}

public class Q2 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            int choice = 0;
            SavingAccount s1 = null;
            CurrentAccount c1 = null;

            while (choice != 11) {
                System.out.println("1.Create an saving Account");
                System.out.println("2.Create an current Account");
                System.out.println("3.Add Balance in saving");
                System.out.println("4.Add bonus and balance in savingAccount..");
                System.out.println("5.Add Balance in CurrentAccount");
                System.out.println("6.Add bonus and balance in CurrentAccount..");
                System.out.println("7.Withdraw money from SavingAccount");
                System.out.println("8.WIthdraw Money from CurrentAccount..");
                System.out.println("9. show detail of saving Account..");
                System.out.println("10.show detail of current Account..");
                System.out.println("11.Exit");

                System.out.println("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1: {
                        s1 = new SavingAccount(sc);
                        break;
                    }
                    case 2: {
                        c1 = new CurrentAccount(sc);

                        break;
                    }

                    case 3: {
                        if (s1 == null) {
                            System.out.println("Create Account First..");
                        } else {
                            System.out.println("Enter amount to deposit in saving account: ");
                            double amount = sc.nextDouble();
                            s1.deposit(amount);

                        }
                        break;
                    }
                    case 4: {
                        if (s1 == null) {
                            System.out.println("Create Account First..");
                        } else {
                            System.out.println("Enter amount and bonus to deposit in saving account: ");
                            double amount = sc.nextDouble();
                            sc.nextLine();
                            double bonus = sc.nextDouble();
                            s1.deposit(amount, bonus);

                        }
                        break;
                    }
                    case 5: {
                        if (c1 == null) {
                            System.out.println("Create Account First..");
                        } else {
                            System.out.println("Enter amount to deposit in current account: ");
                            double amount = sc.nextDouble();
                            c1.deposit(amount);

                        }
                        break;
                    }
                    case 6: {
                        if (c1 == null) {
                            System.out.println("Create Account First..");
                        } else {
                            System.out.println("Enter amount and bonus to deposit in current account: ");
                            double amount = sc.nextDouble();
                            sc.nextLine();
                            double bonus = sc.nextDouble();
                            c1.deposit(amount, bonus);

                        }
                        break;
                    }

                    case 7: {
                        if (s1 == null) {
                            System.out.println("Create Account First..");
                        } else {
                            System.out.println("Enter amount to withdraw in saving account: ");
                            double amount = sc.nextDouble();
                            s1.withdraw(amount);
                        }

                        break;
                    }

                    case 8: {
                        if (c1 == null) {
                            System.out.println("Create Account First..");
                        } else {
                            System.out.println("Enter amount to withdraw in current account: ");
                            double amount = sc.nextDouble();
                            c1.withdraw(amount);
                        }

                        break;
                    }

                    case 9:
                        {
                            if (s1 == null) {
                            System.out.println("Create Account First..");}
                            else
                            {
                                s1.DisplyAccountDetails();
                                s1.accountSummary();
                            }
                            
                            break;
                        }

                     case 10:
                        {
                            if (c1 == null) {
                            System.out.println("Create Account First..");
                            }
                            else
                            {
                                c1.DisplyAccountDetails();
                                c1.accountSummary();
                            }
                            
                            
                            break;
                        }

                    default: {
                        throw new IllegalArgumentException("Invalid choice!");
                    }

                }

                // Account a1=new Account();

            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
