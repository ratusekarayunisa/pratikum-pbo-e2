public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tanggalBerakhir;

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, 
                    double gajiPokok, String fakultas, String nidk, LocalDate tanggalBerakhir) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhir = tanggalBerakhir;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    public int hitungSisaKontrak() {
        Period periode = Period.between(LocalDate.now(), tanggalBerakhir);
        return periode.getMonths();
    }

    @Override
    public LocalDate hitungBUP() {
        return null; // Tidak ada BUP untuk dosen tamu
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + nidk);
        System.out.println("Tunjangan: " + hitungTunjangan());
        System.out.println("Sisa Kontrak: " + hitungSisaKontrak() + " bulan");
    }
}