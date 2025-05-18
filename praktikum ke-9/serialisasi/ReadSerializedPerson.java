/**
 * Nama : Ratu Sekar Ayu Nisa
 * Nim: 24060123140130
 * Tanggal Pembuat: 14/05/2025
 * File: ReadSerializedPerson.java
 * Deskripsi: Program untuk serialisasi objek person
 */
import java.io.*;

public class ReadSerializedPerson{
    public static void main(String[] args) {
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("Serialized person name = "+person.getName());
        }catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}
