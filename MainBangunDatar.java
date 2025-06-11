public class MainBangunDatar {
    public static void main(String[] args) {
        // Membuat objek bangun datar
        Lingkaran lingkaran = new Lingkaran(7);
        Persegi persegi = new Persegi(5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(6, 4);
        Segitiga segitiga = new Segitiga(3, 4, 5, 4);

        // Menggunakan BangunDatarGeneric
        BangunDatarGeneric<Lingkaran> bdg1 = new BangunDatarGeneric<>();
        bdg1.set(lingkaran);
        System.out.println("Keliling lingkaran: " + bdg1.hitungKeliling());
        System.out.println("Luas lingkaran: " + bdg1.hitungLuas());

        BangunDatarGeneric<Persegi> bdg2 = new BangunDatarGeneric<>();
        bdg2.set(persegi);
        System.out.println("Keliling persegi: " + bdg2.hitungKeliling());
        System.out.println("Luas persegi: " + bdg2.hitungLuas());

        // Menggunakan Koleksi generik
        Koleksi<BangunDatar> koleksiBangunDatar = new Koleksi<>();
        koleksiBangunDatar.add(lingkaran);
        koleksiBangunDatar.add(persegi);
        koleksiBangunDatar.add(persegiPanjang);
        koleksiBangunDatar.add(segitiga);

        System.out.println("\nDaftar Bangun Datar:");
        koleksiBangunDatar.showAll();
    }
}