// nama file : Burung.java
// deskripsi : Subclass dari Anabul untuk hewan burung
// Pembuat : Ratu Sekar Ayu Nisa // 24060123140130
public class Burung extends Anabul {
    @Override
    public void bersuara() {
        System.out.println("Burung bersuara: Cuit cuit!");
    }
    
    @Override
    public void bergerak() {
        System.out.println("Burung bergerak: Terbang dengan indah");
    }
}