public class Student extends Person {
    public Student(String name) {
        super(name);
    }
    
    @Override
    public boolean isAsleep(int hr) {
        return 2 < hr && 8 > hr; // Student tidur antara jam 2-8 pagi
    }
}