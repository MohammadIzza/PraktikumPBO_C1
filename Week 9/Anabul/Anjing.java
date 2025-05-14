package Tugas.Anabul;

// Pembuat      : Mohammad Izza Hakiki - 24060123140139
// Tanggal      : 10 Mei 2025
// File         : Anjing.java
// Deskripsi    : Program untuk menyimpan Child, Anjing

class Anjing extends Anabul {

    public Anjing(){
        super();
    }

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara Guk-guk");
    }
}