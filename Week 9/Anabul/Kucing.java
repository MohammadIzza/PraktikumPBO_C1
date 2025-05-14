package Tugas.Anabul;

// Pembuat      : Mohammad Izza Hakiki - 24060123140139
// Tanggal      : 10 Mei 2025
// File         : Kucing.java
// Deskripsi    : Program untuk menyimpan Child, Kucing

class Kucing extends Anabul {

    public Kucing(){
        super();
    }   
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara Meong");
    }
}