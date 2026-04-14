import java.util.Scanner;

class Order {
    int orderId;
    String customerName;
    String[] items;
    double[] prices;

    Order(int orderId, String customerName, String[] items, double[] prices) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
        this.prices = prices;
    }

    double calculateTotal() {
        double total = 0;
        for (double p : prices) {
            total += p;
        }
        return total;
    }

    double applyGST(double gstPercent) {
        double total = calculateTotal();
        return total + (total * gstPercent / 100);
    }

    void displayBill(double gstPercent) {
        System.out.println("\n========== Order Bill ==========");
        System.out.println("Order ID      : " + orderId);
        System.out.println("Customer Name : " + customerName);

        System.out.println("\nItems:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i]);
        }

        double total = calculateTotal();
        double finalTotal = applyGST(gstPercent);

        System.out.println("\nTotal Amount  : Rs." + total);
        System.out.println("GST (" + gstPercent + "%) : Rs." + (finalTotal - total));
        System.out.println("Final Bill    : Rs." + finalTotal);
        System.out.println("================================");
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();
        sc.nextLine();

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Order " + (i + 1));

            System.out.print("Order ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Customer Name: ");
            String cname = sc.nextLine();

            System.out.print("Enter number of items: ");
            int itemCount = sc.nextInt();
            sc.nextLine();

            String[] items = new String[itemCount];
            double[] prices = new double[itemCount];

            for (int j = 0; j < itemCount; j++) {
                System.out.print("Enter item name " + (j + 1) + ": ");
                items[j] = sc.nextLine();

                System.out.print("Enter price of " + items[j] + ": ");
                prices[j] = sc.nextDouble();
                sc.nextLine();
            }

            orders[i] = new Order(id, cname, items, prices);
        }

        System.out.print("\nEnter GST percentage: ");
        double gst = sc.nextDouble();

        System.out.println("\n========= Final Bills =========");
        for (int i = 0; i < n; i++) {
            orders[i].displayBill(gst);
        }

        sc.close();
    }
}
