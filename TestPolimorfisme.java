import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        
        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);
        
        for (Pegawai emp : emps) {
            emp.tampilData();
        }
        
        // Jawaban pertanyaan:
        // 2. Manfaat polimorfisme:
        //    - Dapat menangani berbagai tipe objek dengan cara seragam
        //    - Kode lebih fleksibel dan mudah dikembangkan
        //    - Mengurangi duplikasi kode
        
        // 3. Masalah tanpa polimorfisme:
        //    - Harus membuat pengecekan tipe manual (instanceof)
        //    - Kode menjadi lebih panjang dan kompleks
        //    - Sulit dikembangkan ketika ada tipe pegawai baru
    }
}