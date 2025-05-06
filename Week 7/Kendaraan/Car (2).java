public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare -100.00f;
        System.out.println("Harga sewa mobil: " + fare);
    }

    void sewa() {
        System.out.println("Sewa mobil.");
    }
}
