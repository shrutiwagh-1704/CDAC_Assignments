import java.util.Scanner;

class Product {
    int productId;
    String name;
    double price;
    int quantity;

    // Constructor for initialization
    Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate stock value of one product
    double stockValue() {
        return price * quantity;
    }

    // Update stock quantity
    void updateQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    // Overloaded method: Direct price update
    void updatePrice(double newPrice) {
        price = newPrice;
    }

    // Overloaded method: Discount based update
    void updatePrice(double discountPercent, boolean isDiscount) {
        if (isDiscount) {
            price = price - (price * discountPercent / 100);
        }
    }

    void displayDetails() {
        System.out.println("\n------ Product Details ------");
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Price      : " + price);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Stock Value: " + stockValue());
        System.out.println("------------------------------");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Product " + (i + 1));

            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            products[i] = new Product(id, name, price, qty);
        }

        // Demo updates on first product
        System.out.println("\nUpdating quantity of Product 1 to 50...");
        products[0].updateQuantity(50);

        System.out.println("Applying 10% discount on Product 1...");
        products[0].updatePrice(10, true);

        // Display all products
        System.out.println("\n========= Product Inventory =========");
        double totalInventoryValue = 0;

        for (int i = 0; i < n; i++) {
            products[i].displayDetails();
            totalInventoryValue += products[i].stockValue();
        }

        System.out.println("\nTotal Inventory Value: " + totalInventoryValue);

        sc.close();
    }
}
