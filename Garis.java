public class Titik {
    private double x, y;

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public double panjang() {
        double dx = titikAkhir.getX() - titikAwal.getX();
        double dy = titikAkhir.getY() - titikAwal.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double kemiringan() {
        double dx = titikAkhir.getX() - titikAwal.getX();
        double dy = titikAkhir.getY() - titikAwal.getY();
        return dy / dx;
    }
}

