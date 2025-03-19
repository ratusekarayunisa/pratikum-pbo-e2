public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objrk BangunDatar
        BangunDatar bd = new BangunDatar();
        bd.setJmlSisi(3);
        bd.setWarna("Merah");
        bd.setBorder("Hitam");

        //Membuat objek Persegi
        Persegi p = new Persegi(5, "Hijau", "Kuning");

        System.out.println("Info BangunDatar");
        bd.printInfo();

        System.out.println("");

        System.out.println("Info Persegi");
        //System.out.println("Jumlah sisi Persegi: " + p.jmlSisi);
        //System.out.println("Jumlah Sisi Persegi: " + p.getJmlSisi());
        //System.out.println("Warna Persegi: " + p.getWarna());
        //System.out.println("Border Persegi : " + p.getBorder());
        //System.out.println("Ukuran sisi BangunDatar: " + p.getSisi());
        p.printInfo();
        System.out.println("");
        p.setSisi(6);
        p.printInfo();

    }
}
