/**
 * File : AngkaSialException.java
 * Deskripsi: Eksepsi buatan sendiri, menolak masukan angka 13!
 */


public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memasukan angka 13 karena angka sial!!!");
    }  
}
