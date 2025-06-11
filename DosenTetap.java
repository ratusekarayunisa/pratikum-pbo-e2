public class DosenTetap extends Dosen {
    private String nidn;
    private static final int BUP = 65;

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, 
                     double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerja() * gajiPokok;
    }

    @Override
    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + nidn);
        System.out.println("Tunjangan: " + hitungTunjangan());
        System.out.println("BUP: " + formatTanggal(hitungBUP()));
    }
}