/* Nama File    : Fakultas.java
 * Deskripsi    : Kelas yang merepresentasikan Fakultas dengan atribut nama, tarif UKT, dan gaji pokok
 * Pembuat      : Mohammad Izza Hakiki/24060123140139
 * Tanggal      : 28 Maret 2025
 */

public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public double getTarifUKT() {
        return tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }
}
