public class CoercionExample {
    public static void main(String[] args) {
        // No 1: char ke int (widening)
        int output1 = 'a';
        System.out.println(output1); // 97 (ASCII 'a')
        
        // No 2: double ke int (narrowing, but requires cast)
        double x = 15.5;
        // int output2 = x; // Error: requires explicit cast
        int output2 = (int)x; // 15 (truncated)
        System.out.println(output2);
        
        // No 3: int ke double (widening)
        int y = 25;
        double output3 = y; // 25.0
        System.out.println(output3);
        
        // No 4: int ke char (narrowing, requires cast)
        int z = 78;
        char output4 = (char)z; // 'N' (ASCII 78)
        System.out.println(output4);
        
        // No 5: char ke double (widening)
        char a = 'a';
        double output5 = a; // 97.0
        System.out.println(output5);
    }
}