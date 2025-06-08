import java.util.HashMap;
import java.util.Map;
/**
 * Nama File : LambdaList.java
 * Deskripsi : Implementasi lambda pada List, digunakan sebagai parameter pada method
 * Pembuat : Ratu Sekar Ayu Nisa // 24060123140130
 * Tanggal : Kamis 05/06/2025
 */

 public class LambdaMap{
    public static void main (String[] args){
        Map<String,String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("2486487678637", "hsxysf");
        mahasiswaMap.put("87689377836", "Bambang");
        mahasiswaMap.put("8745247864", "Cici");
        mahasiswaMap.put("8764764746", "Didi");

        //lambda digunakan sebagai parameter
        mahasiswaMap.forEach((key, value) -> System.out.println("NIM :" +key+ " Nama:"+ value));
    }
 }