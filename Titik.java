// Nama File : Titik.java
// Deskripsi : berisi atribut dan method dalam class Titik
// Pembuat : Ratu sekar ayu nisa
// Tanggal: 21 02 2025



public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }


    Titik(){
        this(0,0);
    }
    double getAbsis(){
    return absis;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    double getOrdinat(){
    return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    void printTitik(){
    System.out.println("Titik (" + absis + "," + ordinat + ")");
    }  
    
    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    int getKuadran(){
        if (this.absis > 0 && this.ordinat >0){
            return 1;
        }
        else if (this.absis < 0 && this.ordinat > 0){
            return 2;
        }
        else if (this.absis < 0 && this.ordinat < 0){
            return 3;
        }
        else{
            return 4;
        }
    }

    double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }
    
    double getJarak(Titik T){
        return Math.sqrt(((this.absis - T.absis)* (this.absis-T.absis)) + ((this.ordinat-T.ordinat)*(this.ordinat-T.ordinat)));
    }

    void refleksiX(){
        ordinat = -ordinat;

    }

    void refleksiY(){
        absis = -absis;

    }

    Titik getRefleksiX(){
        return new Titik(this.absis, - this.ordinat);
    }

    Titik getRefleksiY(){
        return new Titik(- this.absis, this.ordinat);
    }


























}
