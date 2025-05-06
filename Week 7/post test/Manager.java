public class Manager extends Pegawai {
    private int tunjangan = 700000;

    // Constructor
    public Manager(String nama) {
        super(nama); // Call the superclass (Pegawai) constructor
    }

    // Override tampilData method to include the additional attribute
    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok + ", Tunjangan : " + tunjangan);
    }
}
