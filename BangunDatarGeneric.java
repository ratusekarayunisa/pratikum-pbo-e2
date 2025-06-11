/**
 * File : BangunDatarGeneric.java
 * Deskripsi : Kelas konstruksi generic untuk BangunDatar
 * Pembuat : Ratu sekar ayu nisa // 24060123140130
 */
public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }

    public double hitungLuas() {
        return bangunDatar.hitungLuas();
    }
}