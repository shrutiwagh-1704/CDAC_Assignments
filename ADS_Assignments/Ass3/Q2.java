

public class Q2 {

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

    static void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
        // Existing list: [10, 20, 30]
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);

        // Insert 5 at beginning
        insertAtBeginning(5);

        System.out.print("LinkedList: ");
        printList();
        
    }
}