/**
 * File : Persegi.java
 * Deskripsi : Implementasi Persegi sebagai BangunDatar
 * Pembuat : Ratu sekar ayu nisa // 24060123140130
 */
public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}