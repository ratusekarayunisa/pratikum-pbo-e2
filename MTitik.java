public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik(3.0, 4.0);
        Titik t2 = new Titik(-2.0, 5.0);
        Titik t3 = new Titik(); // Titik default di (0,0)

        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
        
        t1.printTitik();
        t2.printTitik();
        t3.printTitik();

        if (t1.getKuadran() != 0) {
            System.out.println("\nKuadran t1: " + t1.getKuadran());
        }
        
        if (t2.getKuadran() != 0) {
            System.out.println("Kuadran t2: " + t2.getKuadran());
        }
        
        if (t3.getKuadran() != 0) {
            System.out.println("Kuadran t3: " + t3.getKuadran());
        }

        System.out.println("\nJarak t1 ke pusat: " + t1.getJarakPusat());
        System.out.println("Jarak t2 ke pusat: " + t2.getJarakPusat());
        System.out.println("Jarak antara t1 dan t2: " + t1.getJarak(t2));

        t2.refleksiX();
        t2.printTitik();

        t2.refleksiY();
        t2.printTitik();

        Titik t5 = t1.getRefleksiX();
        Titik t6 = t1.getRefleksiY();

        t5.printTitik();
        t6.printTitik();
    }
}

