# responMD4_FathanF1D02410124

hi mbak

Respon ini terdiri dari 3 file yaitu Node ( untuk inisialisa datanya ), Tree ( untuk method yang ada agar program bisa berjalan di main ) , dan Main (tempat program dijalankan)

# File Node.java

disini isinya cuman inisialisasi data yang kita perlukan dalam menampilkan data yang kita inginkan (bunga dan nilainya)

# file Tree.java

disini isinya itu banyak 

yang pertama ada inisoialisasi node pertama yaitu root / akar (Node root)
kemudian ada fungsi insert untuk menambahkan data bunga dan insert rec (rekursifnya untuk kondisi yang kita atur agar node kiri dan kanan sesuai dengan yang kita inginkan atau syarat traversal) 9Binary Search Tree.)

 yang kedua ada fungsi inorder, untuk menampilkan data berdasarkan urutan traversal inorder tree

 yang ketiga ada fungsi cari nilai terbesar, yaitu fungsi ini untuk mencari nilai yang paling bedsar di data bunga tersebut, bergerak ke root.right sampai mentok.
 yang keempat, ada fungsi print genap yaitu fungsi ini berfungsi untuk menampilkan data yang genap (walapun datanya emg semuanya genap si ), tapi yang dimaksud itu mungkin 20,40,60,80 atau   kelipatan 20

 yang kelima fungsi searcByName (atau mencari bunga kesukaan) itu mencari node berdaarkan nama bunga, dengan mengecek seluruh tree, pencarian dilakukan secara rekurif, Cek node sekarang
Jika nama cocok → tampilkan & return ,Jika tidak, cari ke kiri, Jika masih tidak ketemu, cari ke kanan

# file Main.java

disnilah semua file dimulai atau diajalnkan , kita membuat objek baru  dengan Tree tree = new Tree();

kemudian tambahakn data dengan memnaggil insert(); dan tammpilakndata secara terutut (inorder) , kemddian tampilakn nilai terbesar dengan Node max = tree.findMax(tree.root);
System.out.println("Nilai terbesar: " + max.nama + " (" + max.nilai + ")");, kemudian tampilkan nilai genap (kelipatan20) tree.printGenap(tree.root); dan terakhir kita mencari bunga berdasarkan nama tree.searchByName(tree.root, "Mawar");


