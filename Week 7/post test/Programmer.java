public class Programmer extends Pegawai {
    private int bonus = 450000;

    // Constructor
    public Programmer(String nama) {
        super(nama); // Call the superclass (Pegawai) constructor
    }

    // Override tampilData method to include the additional attribute
    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok + ", Bonus : " + bonus);
    }
}
