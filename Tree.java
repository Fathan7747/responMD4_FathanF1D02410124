public class Tree {
    Node root;

    public void insert (String nama, int nilai) {
        root = insertRec(root, nama, nilai);
    }

    private Node insertRec(Node root, String nama, int nilai) {

        if (root == null) {
            return new Node(nama, nilai);
        }
        if (nilai < root.nilai) {
            root.left = insertRec(root.left, nama, nilai);
        } else {
            root.right = insertRec(root.right,nama, nilai);
        }

        return root;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.printf("| %-12s | %-5d |\n", root.nama, root.nilai);
            inorder(root.right);
        }
    }

    // mencari nilai terbesar
    public Node findMax(Node root) {
        if (root == null) return null;

        while (root.right != null)
            root = root.right;

        return root;
    }

public void printGenap(Node root) {
    if (root != null) {
        printGenap(root.left);
        if (root.nilai % 20 == 0)  // kelipatan 20  
            System.out.printf("| %-12s | %-5d |\n", root.nama, root.nilai);
        printGenap(root.right);
    }
}

public Node searchByName(Node root, String nama) {
    if (root == null) return null;

    if (root.nama.equalsIgnoreCase(nama)) {
        System.out.println("Bunga Kesukaan: " + root.nama + " [" + root.nilai + "]");
        return root;
    }

    Node leftResult = searchByName(root.left, nama);
    if (leftResult != null) return leftResult;

    Node rightResult = searchByName(root.right, nama);
    if (rightResult != null) return rightResult;

    return null;
 
   }
}
