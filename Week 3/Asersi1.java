/* File : Asersi2.java
   Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Nama : Mohammad Izza Hakiki 
 * NIM : 24060123140139
*/

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;

        if (x > 0){
            System.out.println("x bilangan postif");
        }
        else {
            assert x < 0 : "Ada Kesalahan code";
            System.out.println("Nilai x adalah: " + x);
        }
    }
}
