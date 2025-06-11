/**
 * File : PersegiPanjang.java
 * Deskripsi : Implementasi PersegiPanjang sebagai BangunDatar
 * Pembuat : Ratu sekar ayu nisa // 24060123140130
 */
public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
}