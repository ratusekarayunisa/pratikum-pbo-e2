/**
 * File : BangunDatarGenericTest.java
 * Deskripsi : Main class untuk generic bangun datar
 * Pembuat : Ratu sekar ayu nisa // 24060123140130
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        
        System.out.println("Keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("Luas lingkaran : " + bdg.hitungLuas());
        System.out.println("Tipe generic : " + bdg.get().getClass().getName());
    }
}