/**
 * File : Segitiga.java
 * Deskripsi : Implementasi Segitiga sebagai BangunDatar
 * Pembuat : Ratu sekar ayu nisa // 24060123140130
 */
public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    @Override
    public double hitungKeliling() {
        return alas + sisi1 + sisi2;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}