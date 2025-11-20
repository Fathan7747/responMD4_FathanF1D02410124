public class Main {
    public static void main(String[] args) {
        
         Tree tree = new Tree();

          tree.insert("Mawar",    50);
          tree.insert("Melati",   30);
          tree.insert("Anggrek",  70);
          tree.insert("Lavander", 20);
          tree.insert("Tulip",    40);
          tree.insert("Dahlia",   60);
          tree.insert("Sakura",   80);

          System.out.println("=== IN-Order Traversal ===");
          System.out.println("+--------------+-------+");
          System.out.println("| Nama Bunga   | Nilai |");
          System.out.println("+--------------+-------+");
          tree.inorder(tree.root);
          System.out.println("+--------------+-------+");

          System.out.println("=== Tampilkan Bunga dengan Nilai Terbesar");
          Node max = tree.findMax(tree.root);
          System.out.println("Nilai terbesar: " + max.nama + " [" + max.nilai + "]") ;

          System.out.println("=== Tampilkan Genap ==="); // genap semua btw nilai bunganya mbak:)
          System.out.println("+--------------+-------+");
          System.out.println("| Nama Bunga   | Nilai |");
          System.out.println("+--------------+-------+");
          tree.printGenap(tree.root);
          System.out.println("+--------------+-------+");

          System.out.println("== Tampilkan bunga kesukaan  ==");
          tree.searchByName(tree.root, "Mawar");


    }
}
