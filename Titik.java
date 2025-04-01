// Nama File : Titik.java
// Deskripsi : Berisi atribut dan method dalam class Titik
// Pembuat :
// Tanggal:

public class Titik {
    private double x, y;
    private static int counterTitik = 0;

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
        counterTitik++;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    public void printTitik() {
        System.out.println("Titik (" + x + ", " + y + ")");
    }

    public int getKuadran() {
        if (x > 0 && y > 0) return 1;
        if (x < 0 && y > 0) return 2;
        if (x < 0 && y < 0) return 3;
        if (x > 0 && y < 0) return 4;
        return 0; // Origin
    }

    public double getJarakPusat() {
        return Math.sqrt(x * x + y * y);
    }

    public double getJarak(Titik t) {
        return Math.sqrt(Math.pow(this.x - t.x, 2) + Math.pow(this.y - t.y, 2));
    }

    public void refleksiX() {
        this.x = -this.x;
    }

    public void refleksiY() {
        this.y = -this.y;
    }

    public Titik getRefleksiX() {
        return new Titik(-this.x, this.y);
    }

    public Titik getRefleksiY() {
        return new Titik(this.x, -this.y);
    }
}
