import java.util.ArrayList;

/**
 * File : Koleksi.java
 * Deskripsi : Kelas generik untuk koleksi objek
 * Pembuat : Ratu sekar ayu nisa // 24060123140130
 */
public class Koleksi<T> {
    private ArrayList<T> wadah;
    private int nbelm;

    public Koleksi() {
        wadah = new ArrayList<T>();
        nbelm = 0;
    }

    public int getIsi() {
        return nbelm;
    }

    public void setIsi(int index, T elemen) {
        if (index >= 0 && index < nbelm) {
            wadah.set(index, elemen);
        }
    }

    public int getSize() {
        return wadah.size();
    }

    public void setSize(int size) {
        // ArrayList secara dinamis menyesuaikan ukuran
    }

    public void add(T elemen) {
        wadah.add(elemen);
        nbelm++;
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            wadah.remove(index);
            nbelm--;
        }
    }

    public void showAll() {
        for (T elemen : wadah) {
            System.out.println(elemen);
        }
    }

    public Anabul get(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
}