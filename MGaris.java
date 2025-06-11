/* Nama File    : MGaris.java
 * Deskripsi    : main class untuk menguji class Garis
 * Pembuat      : Ratu Sekar Ayu Nisa // 24060123140130
 * Tanggal      :
 */

public class MGaris{
    public static void main(String[] args) {
        // Membuat beberapa titik
        Titik t1 = new Titik(0, 0);
        Titik t2 = new Titik(3, 4);
        Titik t3 = new Titik(-2, 0);
        Titik t4 = new Titik(0, 4);

        // Membuat garis
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t3, t4);
        Garis g3 = new Garis(new Titik(1, 1), new Titik(2, 2));

        // Menguji method Garis
        System.out.println("Panjang g1: " + g1.getPanjang());
        System.out.println("Gradien g1: " + g1.getGradien());
        
        Titik tengah = g1.getTitikTengah();
        System.out.print("Titik tengah g1: ");
        tengah.printTitik();

        System.out.println("Persamaan g2: " + g2.getPersamaanGaris());
        
        System.out.println("Apakah g1 dan g3 sejajar? " + g1.isSejajar(g3));
        System.out.println("Apakah g1 dan g2 tegak lurus? " + g1.isTegakLurus(g2));

        // Menampilkan counter
        System.out.println("Jumlah garis yang dibuat: " + Garis.getCounterGaris());
    }
}
