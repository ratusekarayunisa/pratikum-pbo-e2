

// Nama File : Titik.java
// Deskripsi : berisi atribut dan method dalam class Titik
// Pembuat : Ratu sekar ayu nisa
// Tanggal: 21 Februari 2025


public class MTitik {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        Titik t1 = new Titik();
        Titik t2 = new Titik();

        Titik t3 = new Titik();

        t3.printCounterTitik();

        int counterTitik = Titik.getCounterTitik();
        System.out.println("\nJumlah titik ada= "+counterTitik);

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + t2.getCounterTitik());

        System.out.println("\nkuadran t2" + t2.getKuadran());
        System.out.println("\nJarak pusat t1=" +t1.getJarakPusat());
        System.out.println("\nJarak t1 dan t2=" + t1.getJarak(t2));

        t2.refleksiX();
        t2.printTitik();
        t2.refleksiY();
        t2.printTitik();

        Titik t5 = t2.getRefleksiX();
        Titik t6 = t2.getRefleksiY();
        t5.printTitik();
        t6.printTitik();


    }

}

