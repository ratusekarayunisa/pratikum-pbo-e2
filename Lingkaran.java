/* Nama File    : Lingkaran.java
 * Deskripsi    : Class Lingkaran turunan dari BangunDatar
 * Pembuat      : Ratu Sekar Ayu Nisa// 24060123140130
 * Tanggal      : [Tanggal Pembuatan]
 */

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran() {
        super();
    }

    public Lingkaran(double jariJari, String warna, String border) {
        super(warna, border);
        this.jariJari = jariJari;
    }

    // Implementasi abstract methods
    @Override
    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    // Method khusus Lingkaran
    public double getDiameter() {
        return 2 * jariJari;
    }

    // Overriding method printInfo
    @Override
    public void printInfo() {
        System.out.println("=== Lingkaran ===");
        super.printInfo();
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("Diameter: " + getDiameter());
    }
}
