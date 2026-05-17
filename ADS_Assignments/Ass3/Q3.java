// Q3. Insert a new node at a given position in a LinkedList

public class Q3 {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node head = null;

    static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Insert at given position (1-based index)
    static void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // If inserting at position 1 (beginning)
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to (position - 1)th node
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) { System.out.println("Position out of range"); return; }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Existing list: [10, 20, 30, 40]
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);

        // Insert 25 at position 3
        insertAtPosition(25, 3);

        System.out.print("LinkedList: ");
        printList();
        // Expected: 10 20 25 30 40
    }
}