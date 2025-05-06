/* Nama File    : Karyawan.java
 * Deskripsi    : Kelas abstrak yang merepresentasikan karyawan sebagai bagian dari Civitas Akademika
 * Pembuat      : Mohammad Izza Hakiki/24060123140139
 * Tanggal      : 28 Maret 2025
 */

public abstract class Karyawan extends CivitasAkademika {
    protected String NIP;
    protected int masaKerja;

    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();

    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }
}
