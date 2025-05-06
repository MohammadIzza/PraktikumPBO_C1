/*  Program     : Anjing.java
    Deskripsi   : Atribut dan method subclass Anjing.
NIM/Nama    : 24060123140139/ Mohammad Izza Hakiki
    Tanggal     : Kamis, 24 April 2025  */

public class Anjing extends Anabul {
    public Anjing() {
        super("");
    }

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Anjing " + getNama() + " melata.");
    }

    @Override
    public void bersuara() {
        System.out.println("Anjing " + getNama() + " bersuara guk-guk.");
    }
}
