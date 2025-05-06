/*  Program     : Burung.java
    Deskripsi   : Atribut dan method subclass Burung.
    NIM/Nama    : 24060123140139/ Mohammad Izza Hakiki
    Tanggal     : Kamis, 24 April 2025  */
public class Burung extends Anabul {
    public Burung() {
        super("");
    }

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Burung " + getNama() + " terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println("Burung " + getNama() + " berbunyi cuit.");
    }
}
