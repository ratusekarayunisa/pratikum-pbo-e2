public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
        
        // Contoh penggunaan method dengan parameter polimorfik
        hitungSewa(kendaraan, 50, 1000);
        hitungSewa(mobil, 50, 1000);
        hitungSewa(bis, 50, 1000);
    }
    
    // Method yang memanfaatkan polimorfisme
    public static void hitungSewa(Vehicle v, int distance, float price) {
        System.out.print("Menghitung sewa dengan polimorfisme: ");
        v.calRent(distance, price);
    }
}