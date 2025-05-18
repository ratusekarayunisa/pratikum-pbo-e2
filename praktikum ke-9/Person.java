/**
 * Nama : Ratu Sekar Ayu Nisa
 * Nim: 24060123140130
 * Tanggal Pembuat: 14/05/2025
 * File: Person.java
 * Deskripsi: Person database model
 */
public class  Person {
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }
    
    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
