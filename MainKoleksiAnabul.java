import java.util.Random;

public class MainKoleksiAnabul {
    public static void main(String[] args) {
        // Membuat koleksi anabul
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>();
        Random random = new Random();

        // Menambahkan 10 anabul acak
        for (int i = 1; i <= 10; i++) {
            int jenis = random.nextInt(3);
            switch (jenis) {
                case 0:
                    koleksiAnabul.add(new Kucing("Kucing " + i));
                    break;
                case 1:
                    koleksiAnabul.add(new Anjing("Anjing " + i));
                    break;
                case 2:
                    koleksiAnabul.add(new Burung("Burung " + i));
                    break;
            }
        }

        // Menampilkan semua anabul dan perilakunya
        System.out.println("=== Daftar Anabul ===");
        for (int i = 0; i < koleksiAnabul.getIsi(); i++) {
            Anabul anabul = koleksiAnabul.get(i);
            System.out.println(anabul);
            anabul.gerak();
            anabul.bersuara();
            System.out.println();
        }
    }
}