/* Nama File    : mahasiswa.java
 * Deskripsi    : Kelas Mahasiswa yang merupakan turunan dari CivitasAkademika
 * Pembuat      : Mohammad Izza Hakiki/24060123140139
 * Tanggal      : 28 Maret 2025
 */

public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    private static int count = 0;

    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        count++;
    }

    public double hitungUKT() {
        double ukt = fakultas.getTarifUKT();
        // Biaya UKT berkurang 5% setiap semester
        for (int i = 1; i < semester; i++) {
            ukt *= 0.95;
        }
        return ukt;
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("NIM: " + NIM);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Biaya UKT: Rp " + hitungUKT());
    }

    public static int getCount() {
        return count;
    }
}
