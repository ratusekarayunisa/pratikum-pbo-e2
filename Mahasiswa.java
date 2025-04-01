public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul = new MataKuliah[50];
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private int jumlahMatKul = 0; // Menambahkan atribut untuk melacak jumlah mata kuliah

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.dosenWali = null;
        this.kendaraan = null;
    }

    // Konstruktor dengan parameter nim, nama, dan prodi
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.dosenWali = null;
        this.kendaraan = null;
    }

    // Selector dan mutator untuk nim
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Selector dan mutator untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Selector dan mutator untuk prodi
    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Selector dan mutator untuk dosenWali
    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // Selector dan mutator untuk kendaraan
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Method addMatKul() untuk menambahkan mata kuliah ke listMatKul
    public void addMatKul(MataKuliah matkul) {
        if (jumlahMatKul < listMatKul.length) {
            listMatKul[jumlahMatKul] = matkul;
            jumlahMatKul++;
        } else {
            System.out.println("List mata kuliah sudah penuh.");
        }
    }

    // Method getJumlahSKS() untuk mendapatkan jumlah SKS mata kuliah yang diambil mahasiswa
    public int getJumlahSKS() {
        int totalSks = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            totalSks += listMatKul[i].getSks();
        }
        return totalSks;
    }

    // Method getJumlahMatKul() untuk mendapatkan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    // Method printMhs() untuk menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Method printDetailMhs() untuk menampilkan nim, nama, prodi, daftar mata kuliah, data dosen wali, dan data kendaraan
    public void printDetailMhs() {
        System.out.println("Detail Mahasiswa:");
        printMhs();
        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i]);
        }
        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali);
        } else {
            System.out.println("Dosen Wali: Belum ditentukan");
        }
        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan);
        } else {
            System.out.println("Kendaraan: Belum ditentukan");
        }
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", prodi='" + prodi + '\'' +
                ", dosenWali=" + dosenWali +
                ", kendaraan=" + kendaraan +
                '}';
    }
}