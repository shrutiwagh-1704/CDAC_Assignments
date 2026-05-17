

public class Q5 {

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

   
    static void deleteLast() {
        if (head == null) { System.out.println("List is empty"); return; }
        if (head.next == null) { head = null; return; } // Only one node

       
        Node temp = head;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null; // Remove last node
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
  
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);

        deleteLast();

        System.out.print("LinkedList: ");
        printList();
  
    }
}