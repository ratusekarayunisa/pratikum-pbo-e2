/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Ratu Sekar Ayu Nisa
 * Tanggal      
 */

public class Garis {
    /***********ATRIBUT***********/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /***********METHOD***********/
    // Konstruktor tanpa parameter
    public Garis() {
        this(new Titik(), new Titik(1, 1));
    }

    // Konstruktor dengan parameter
    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    // Getter dan Setter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik titik) {
        this.titikAwal = titik;
    }

    public void setTitikAkhir(Titik titik) {
        this.titikAkhir = titik;
    }

    // Method lainnya
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    public double getGradien() {
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        return deltaY / deltaX;
    }

    public Titik getTitikTengah() {
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);
    }

    public boolean isSejajar(Garis g) {
        return Math.abs(this.getGradien() - g.getGradien()) < 0.0001;
    }

    public boolean isTegakLurus(Garis g) {
        return Math.abs(this.getGradien() * g.getGradien() + 1) < 0.0001;
    }

    public void printGaris() {
        System.out.print("Garis dari ");
        titikAwal.printTitik();
        System.out.print(" ke ");
        titikAkhir.printTitik();
        System.out.println();
    }

    public String getPersamaanGaris() {
        double m = this.getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }

    // Static method
    public static int getCounterGaris() {
        return counterGaris;
    }
}