/* Nama File    : Main.java
 * Deskripsi    : Program utama yang berisi driver class untuk menjalankan aplikasi
 * Pembuat      : Mohammad Izza Hakiki/24060123140139
 * Tanggal      : 28 Maret 2025
 */

public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int count = 0;

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        count++;
    }

    @Override
    public double hitungGaji() {
        double gaji = fakultas.getGajiPokok();
        return gaji + (masaKerja * 0.01 * gaji);
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Gaji: Rp " + hitungGaji());
    }

    public static int getCount() {
        return count;
    }
}
