/**
 * File : Lingkaran.java
 * Deskripsi : Implementasi Lingkaran sebagai BangunDatar
 * Pembuat : Ratu sekar ayu nisa // 24060123140130
 */
public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * jejari * Math.PI;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jejari * jejari;
    }
}