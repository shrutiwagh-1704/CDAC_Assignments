

public class Q7 {

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

    static void search(int value) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == value) {
                System.out.println("Element found at index " + index);
                return;
            }
            temp = temp.next;
            index++;
        }

        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        // Existing list: [10, 20, 30, 40]
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);

        search(30);
       
    }
}