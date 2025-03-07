/** 
 * File : AngkaSial.java 
 * Deskripsi : Program penggunaan exception buatan sendiri
 * Pengenalan klausul 'throw' dan 'throws'
 * Nama : Mohammad Izza Hakiki 
 * NIM : 24060123140139
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13); // This will throw the custom exception
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/* 
Pertanyaan 1: Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
Jawaban: Tidak, baris 12 pada AngkaSial.java tidak dieksekusi jika eksepsi terjadi. Eksepsi akan dilempar pada baris 13, dan eksekusi langsung melompat ke blok catch. Oleh karena itu, baris 12, yang berisi System.out.println(angka + " bukan angka sial");, hanya akan dieksekusi jika tidak ada eksepsi yang dilemparkan, yaitu jika angka bukan 13.

Pertanyaan 2: Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
Jawaban: Ya, baris 21 pada AngkaSial.java dieksekusi setelah eksepsi ditangkap oleh blok catch. Baris ini berisi perintah untuk mencetak pesan eksepsi (ase.getMessage()) dan pesan peringatan ("hati-hati memasukkan angka!!!"). Jika eksepsi dilemparkan (dalam hal ini, ketika angka yang dimasukkan adalah 13), baris ini akan dieksekusi.
*/
