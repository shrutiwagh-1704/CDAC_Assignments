
public class Q1 {

  
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
       
        insertAtEnd(5);
        insertAtEnd(10);
        insertAtEnd(15);

        
        insertAtEnd(20);
        insertAtEnd(25);

        System.out.print("LinkedList: ");
        printList();
       
    }
}