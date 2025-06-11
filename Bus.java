public class Bus extends Vehicle {
    @Override
    void calRent(int distance, float price) {
        float fare = distance * price * 1.5f; // Bus lebih mahal
        System.out.println("Harga sewa bus = " + fare);
    }
}
