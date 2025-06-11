public import java.time.LocalDate;

public class MainPegawai {
    public static void main(String[] args) {
        // Membuat objek pegawai
        DosenTetap dosen1 = new DosenTetap(
            "12345", "Dr. Ahmad", LocalDate.of(1975, 5, 10), 
            LocalDate.of(2015, 1, 1), 10000000, "FTI", "123456789"
        );
        
        DosenTamu dosen2 = new DosenTamu(
            "12346", "Prof. Budi", LocalDate.of(1960, 8, 15), 
            LocalDate.of(2023, 1, 1), 8000000, "FEB", "987654321",
            LocalDate.of(2025, 12, 31)
        );
        
        Tendik tendik1 = new Tendik(
            "12347", "Siti", LocalDate.of(1980, 3, 20), 
            LocalDate.of(2010, 6, 1), 5000000, "Akademik"
        );
        
        // Menampilkan info pegawai
        System.out.println("=== Dosen Tetap ===");
        dosen1.printInfo();
        
        System.out.println("\n=== Dosen Tamu ===");
        dosen2.printInfo();
        
        System.out.println("\n=== Tenaga Kependidikan ===");
        tendik1.printInfo();
    }
}
