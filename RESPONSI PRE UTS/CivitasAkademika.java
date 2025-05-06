/* Nama File    : civitasAkademika.java
 * Deskripsi    : Kelas abstrak yang merepresentasikan civitas akademika
 * Pembuat      : Mohammad Izza Hakiki/24060123140139
 * Tanggal      : 28 Maret 2025
 */

public abstract class CivitasAkademika {
    protected String nama;
    protected String email;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public abstract void tampilkanInformasi();
}
