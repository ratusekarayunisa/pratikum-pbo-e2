public class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, 
                 double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja() * gajiPokok;
    }

    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + bidang);
        System.out.println("Tunjangan: " + hitungTunjangan());
        System.out.println("BUP: " + formatTanggal(hitungBUP()));
    }
}