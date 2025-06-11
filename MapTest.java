import java.util.*;

/**
 * File : MapTest.java
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 * Pembuat : Ratu sekar ayu nisa // 24060123140130
 */
public class MapTest {
    public static void main(String[] args) {
        // Kunci-> integer, nilai-> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        // Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        
        // Mengambil elemen pertama
        System.out.println(map.get(1));
        
        // Mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> keys = map.keySet();
        
        // Iterasi untuk mengambil keseluruhan nilai dari kunci
        for (Integer key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}