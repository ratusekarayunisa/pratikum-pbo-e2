//nama file :  Anabul.java
// Deskripsi : Class induk untuk semua hewan peliharaan
// Pembuat : Ratu Sekar Ayu Nisa // 24060123140130
public class Anabul {
    // Method untuk menghasilkan suara (akan di-override oleh subclass)
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    // Method untuk gerakan (akan di-override oleh subclass)
    public void bergerak() {
        System.out.println("Hewan bergerak");
    }
}
