// Nama file: MainAnabul.java
// Pembuat : Ratu Sekar Ayu Nisa // 24060123140130
// Deskripsi : Program utama untuk mendemonstrasikan polimorfisme

public class MainAnabul {
    public static void main(String[] args) {
        // Membuat array Anabul (polimorfisme)
        Anabul[] hewanPeliharaan = {
            new Kucing(),
            new Anjing(),
            new Burung()
        };
        
        // Simulasi semua bunyi dan gerakan
        System.out.println("=== Simulasi Anabul ===");
        for (Anabul hewan : hewanPeliharaan) {
            hewan.bersuara();
            hewan.bergerak();
            System.out.println(); // spasi antar hewan
        }
        
        // Atau bisa juga dipanggil satu per satu
        System.out.println("\n=== Demo Individu ===");
        Anabul kucing = new Kucing();
        Anabul anjing = new Anjing();
        Anabul burung = new Burung();
        
        System.out.println("Kucing:");
        kucing.bersuara();
        kucing.bergerak();
        
        System.out.println("\nAnjing:");
        anjing.bersuara();
        anjing.bergerak();
        
        System.out.println("\nBurung:");
        burung.bersuara();
        burung.bergerak();
    }
}