

public class Q9 {

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

    // Reverse the linked list
    static void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   
            current.next = prev;   
            prev = current;        
            current = next;        
        }

        head = prev; // New head is the last node
    }

    static void printList() {
        if (head == null) { System.out.println("(empty)"); return; }
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

        reverse();
        System.out.print("LinkedList: ");
        printList();
       

    
        head = null;
        reverse();
        System.out.print("LinkedList: ");
        printList();
     
    }
}