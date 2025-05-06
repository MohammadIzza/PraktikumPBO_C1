/*  Program     : Kucing.java
    Deskripsi   : Atribut dan method subclass Kucing.
    NIM/Nama    : 24060123140139/ Mohammad Izza Hakiki
    Tanggal     : Kamis, 24 April 2025  */

public class Kucing extends Anabul {
    public Kucing() {
        super("");
    }

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Kucing " + getNama() + " melata.");
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing " + getNama() + " berbunyi meong.");
    }
}
