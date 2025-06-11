import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerja() {
        Period periode = Period.between(tmt, LocalDate.now());
        return periode.getYears();
    }

    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggalLahir));
        System.out.println("TMT: " + formatTanggal(tmt));
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Gaji Pokok: " + gajiPokok);
    }

    protected String formatTanggal(LocalDate tanggal) {
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                         "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return tanggal.getDayOfMonth() + " " + bulan[tanggal.getMonthValue()-1] + " " + tanggal.getYear();
    }
}