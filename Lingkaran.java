public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){
    }
    public Lingkaran(double diamater, String border, String warna){
        super(1, warna, border);
        this.jari = diamater/2;
        //setBorder(border);
        //setWarna(warna);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }
    
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 *Math.PI *jari;
    }
}

