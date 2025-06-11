/* Nama File    : Persegi.java
 * Deskripsi    : Class Persegi turunan dari BangunDatar
 * Pembuat      : Ratu SEkar Ayu Nisa // 24060123140130
 * Tanggal      : [Tanggal Pembuatan]
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        super();
    }

    public Persegi(double sisi, String warna, String border) {
        super(warna, border);
        this.sisi = sisi;
    }

    // Implementasi abstract methods
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    // Method khusus Persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // Overriding method printInfo
    @Override
    public void printInfo() {
        System.out.println("=== Persegi ===");
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Diagonal: " + getDiagonal());
    }
}