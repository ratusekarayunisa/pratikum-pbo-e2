/**
 * File : Anjing.java
 * Deskripsi : Implementasi Anjing sebagai Anabul
 * Pembuat : Ratu sekar ayu nisa // 24060123140130
 */
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak: Melata dengan lincah");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk guk!");
    }

    @Override
    public String toString() {
        return super.toString() + " (Anjing)";
    }
}