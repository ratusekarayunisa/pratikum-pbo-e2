/* Nama File    : BangunDatar.java
 /* Deskripsi    : Abstract class untuk bangun datar
 * Pembuat      : Ratu Sekar Ayu Nisa // 24060123140130
 * Tanggal      : [Tanggal Pembuatan]
 */

public abstract class BangunDatar {
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Abstract methods
    public abstract double getLuas();
    public abstract double getKeliling();

    // Concrete method untuk membandingkan luas
    public boolean isEqualLuas(BangunDatar X) {
        return Math.abs(this.getLuas() - X.getLuas()) < 0.0001;
    }

    // Concrete method untuk membandingkan keliling
    public boolean isEqualKeliling(BangunDatar X) {
        return Math.abs(this.getKeliling() - X.getKeliling()) < 0.0001;
    }

    // Method untuk menampilkan info
    public void printInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    // Static method
    public static void printCounter() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}