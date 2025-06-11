import java.util.ArrayList;

//file : ArrayListTest.java
//Deskripsi : Program penggunaan objek ArrayList sebagai Collection class
//Pembuat : Ratu sekar ayu nisa // 24060123140130

public class ArrayListTest {
    public static void main(String[] args) {
        // Inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        
        // Menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        
        // Menghapus elemen
        strings.remove("praktikum");
        
        // Iterasi pada keseluruhan ArrayList
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}