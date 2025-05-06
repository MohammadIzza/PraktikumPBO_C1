public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    // Constructor
    public Pegawai(String nama) {
        this.nama = nama;
    }

    // Method to set the name
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method to display the employee data
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
