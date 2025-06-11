/* Nama File    : MainBangunDatar.java
 * Deskripsi    : Class utama untuk menguji abstract class
 * Pembuat      : Ratu Sekar Ayu Nisa // 24060123140130
 * Tanggal      : [Tanggal Pembuatan]
 */

public class MainBangunDatar {
    public static void main(String[] args) {
        // Membuat objek bangun datar
        // BangunDatar b1 = new BangunDatar(); // Error: tidak bisa instantiate abstract class
        
        BangunDatar p1 = new Persegi(10, "Merah", "Solid");
        Persegi p2 = new Persegi(5, "Biru", "Dotted");
        BangunDatar l1 = new Lingkaran(7, "Hijau", "Dashed");
        Lingkaran l2 = new Lingkaran(14, "Kuning", "Double");
        
        // Memanggil method
        p1.printInfo();
        System.out.println();
        l1.printInfo();
        
        // Membandingkan luas dan keliling
        System.out.println("\nPerbandingan Luas:");
        System.out.println("p1 dan l1 sama luas? " + p1.isEqualLuas(l1));
        System.out.println("p2 dan l2 sama luas? " + p2.isEqualLuas(l2));
        
        System.out.println("\nPerbandingan Keliling:");
        System.out.println("p1 dan l1 sama keliling? " + p1.isEqualKeliling(l1));
        System.out.println("p2 dan l2 sama keliling? " + p2.isEqualKeliling(l2));
        
        // Menampilkan counter
        BangunDatar.printCounter();
    }
}