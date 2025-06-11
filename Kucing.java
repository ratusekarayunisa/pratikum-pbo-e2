//nama file :  Kucing.java
// deskripsi : Subclass dari Anabul untuk hewan kucing
// Pembuat : Ratu Sekar Ayu Nisa // 24060123140130
public class Kucing extends Anabul {
    @Override
    public void bersuara() {
        System.out.println("Kucing bersuara: Meong!");
    }
    
    @Override
    public void bergerak() {
        System.out.println("Kucing bergerak: Melata dengan anggun");
    }
}