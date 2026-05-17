

public class Q10 {

    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    // Insert into BST
    static Node insert(Node root, int data) {
        if (root == null) return new Node(data); 

        if (data < root.data)
            root.left = insert(root.left, data);   
        else if (data > root.data)
            root.right = insert(root.right, data); 
        return root;
    }

    
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Search in BST
    static boolean search(Node root, int value) {
        if (root == null) return false;           
        if (root.data == value) return true;      
        if (value < root.data) return search(root.left, value);   
        return search(root.right, value);         
    }

    public static void main(String[] args) {
        Node root = null;

       
        int[] values = {50, 30, 20, 40, 70, 60, 80};
        for (int v : values) root = insert(root, v);

        System.out.print("BST Inorder: ");
        inorder(root);
        System.out.println();
       
       
        System.out.println("Search 40: " + (search(root, 40) ? "Found" : "Not Found"));
        

        System.out.println("Search 90: " + (search(root, 90) ? "Found" : "Not Found"));
        
    }
}