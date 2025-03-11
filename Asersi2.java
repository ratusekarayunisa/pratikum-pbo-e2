/*
 * File : Asersi1.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input 
 *             jari jari lingkaran yang bernilai nol
 * 
 */

    //class Lingkaran
    class Lingkaran {
        private double jariJari;
        public Lingkaran(double jariJari){
            this.jariJari = jariJari;
        }
        public double hitungKeliling(){
            double keliling = 2*Math.PI*jariJari;
            return keliling;
        }
    }
    //class Asersi2
    public class Asersi2 {
        public static void main(String[] args) {
            double jariJari = 0;
            assert (jariJari>0) : "Jari Jari tidak boleh nol!!";
            Lingkaran l = new Lingkaran(jariJari);
            double kelilingLingkaran = l.hitungKeliling();
            System.out.println("keliling lingkaran ="
                +kelilingLingkaran);
        }   
    }

/* Pertanyaan : secara konsep, ada yang kurang tepat pada program Asersi2 di atas
 * Jawaban : Program **Asersi2.java** memiliki beberapa kesalahan konsep. Pertama, 
 *           fitur `assert` di Java tidak aktif secara default dan harus dijalankan 
 *           dengan opsi `-ea` agar berfungsi. Kedua, `assert` seharusnya ditempatkan 
 *           dalam konstruktor kelas `Lingkaran`, bukan di metode `main`, agar validasi 
 *           terjadi saat objek dibuat. Jika `assert` tidak diaktifkan, program tetap akan 
 *           membuat objek `Lingkaran` dengan jari-jari nol, yang bertentangan dengan tujuan asersi. 
 *           Selain itu, nama kelas harus sesuai dengan nama file (`Asersi2.java` → `public class Asersi2`). 
 *           Untuk perbaikan, validasi jari-jari lingkaran sebaiknya dipindahkan ke konstruktor `Lingkaran`, 
 *           sehingga program langsung mencegah pembuatan objek dengan jari-jari nol atau negatif.
 */ 
