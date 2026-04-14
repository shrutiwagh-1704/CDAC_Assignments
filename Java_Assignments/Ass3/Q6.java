import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    static int totalBooks = 0;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
        totalBooks++;
    }

    void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book Issued Successfully: " + title);
        } else {
            System.out.println("Book cannot be issued! Already issued.");
        }
    }

    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book Returned Successfully: " + title);
        } else {
            System.out.println("Book is already available in library.");
        }
    }

    void displayDetails() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Status    : " + (isAvailable ? "Available" : "Issued"));
        System.out.println("-----------------------------");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            books[i] = new Book(id, title, author);
        }

        System.out.println("\nTotal Books in Library: " + Book.totalBooks);

        
        System.out.println("\nIssuing Book 1...");
        books[0].issueBook();

        
        System.out.println("\nIssuing Book 1 again...");
        books[0].issueBook();

        
        System.out.println("\nReturning Book 1...");
        books[0].returnBook();

        
        System.out.println("\n========= Available Books =========");
        for (int i = 0; i < n; i++) {
            if (books[i].isAvailable) {
                books[i].displayDetails();
            }
        }

      
        System.out.println("\n========= Issued Books =========");
        for (int i = 0; i < n; i++) {
            if (!books[i].isAvailable) {
                books[i].displayDetails();
            }
        }

        sc.close();
    }
}