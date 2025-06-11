/**
 * File : Kucing.java
 * Deskripsi : Implementasi Kucing sebagai Anabul
 * Pembuat : Ratu sekar ayu nisa // 24060123140130
 */
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak: Melata dengan anggun");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong!");
    }

    @Override
    public String toString() {
        return super.toString() + " (Kucing)";
    }
}