/** 
 * File : AngkaSialException.java 
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Nama : Mohammad Izza Hakiki 
 * NIM : 24060123140139
 */
public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
