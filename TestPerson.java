public class TestPerson {
    public static void main(String[] args) {
        Person p;
        p = new Student("Sally");
        p.status(1); // Output: "Now online: Sally"
        
        // Penjelasan:
        // - Pada runtime, method isAsleep() yang dipanggil adalah milik Student
        // - Student.isAsleep(1) mengembalikan false (karena 1 tidak antara 2-8)
        // - Maka status() akan mencetak "Now online: Sally"
    }
}