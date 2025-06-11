/* Nama File    : IResize.java
 * Deskripsi    : Interface untuk objek yang bisa di-resize
 * Pembuat      : Ratu Sekar Ayu Nisa // 24060123140130
 * Tanggal      : [Tanggal Pembuatan]
 */

public interface IResize {
    void zoomIn();      // Menambah ukuran 10% lebih besar
    void zoomOut();     // Mengurangi ukuran 10% lebih kecil
    void zoom(int percent); // Mengubah ukuran sesuai persentase
}