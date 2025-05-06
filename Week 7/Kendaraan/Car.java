public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.0f;
        System.out.println("harga sewa mobil = " + fare);
    }
}
