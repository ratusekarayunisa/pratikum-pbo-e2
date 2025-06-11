/**
 * File : Anabul.java
 * Deskripsi : Kelas induk untuk hewan peliharaan
 */
public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();

    @Override
    public String toString() {
        return "Nama: " + nama;
    }
}