public class Pegawai {
    private String nama;
    private static int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println(" Nama: " + nama + ", Gaji Pokok: " + gajiPokok);
    }
}
