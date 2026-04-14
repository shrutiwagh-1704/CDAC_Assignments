import java.util.Scanner;

class Ticket {
    int ticketId;
    String passengerName;
    String source;
    String destination;
    double fare;

    static int totalBookings = 0;

    Ticket(int ticketId, String passengerName, String source, String destination, double fare) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        totalBookings++;
    }

    void updateFare(double newFare) {
        fare = newFare;
    }

    void displayTicket() {
        System.out.println("\n------ Ticket Details ------");
        System.out.println("Ticket ID      : " + ticketId);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Source         : " + source);
        System.out.println("Destination    : " + destination);
        System.out.println("Fare           : " + fare);
        System.out.println("-----------------------------");
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bookings: ");
        int n = sc.nextInt();
        sc.nextLine();

        Ticket[] tickets = new Ticket[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Ticket " + (i + 1));

            System.out.print("Ticket ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Passenger Name: ");
            String pname = sc.nextLine();

            System.out.print("Source: ");
            String source = sc.nextLine();

            System.out.print("Destination: ");
            String dest = sc.nextLine();

            System.out.print("Fare: ");
            double fare = sc.nextDouble();
            sc.nextLine();

            tickets[i] = new Ticket(id, pname, source, dest, fare);
        }

        System.out.println("\nTotal Bookings: " + Ticket.totalBookings);

        // Calculate total fare
        double totalFare = 0;
        for (int i = 0; i < n; i++) {
            totalFare += tickets[i].fare;
        }
        System.out.println("Total Fare Collected: " + totalFare);

        // Update fare demo (update first ticket)
        System.out.println("\nUpdating fare of first ticket...");
        tickets[0].updateFare(tickets[0].fare + 50);

        // Display all tickets
        System.out.println("\n========= All Ticket Details =========");
        for (int i = 0; i < n; i++) {
            tickets[i].displayTicket();
        }

        sc.close();
    }
}