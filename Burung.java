/**
 * File : Burung.java
 * Deskripsi : Implementasi Burung sebagai Anabul
 * Pembuat : Ratu sekar ayu nisa // 24060123140130
 */
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak: Terbang dengan indah");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit cuit!");
    }

    @Override
    public String toString() {
        return super.toString() + " (Burung)";
    }
}