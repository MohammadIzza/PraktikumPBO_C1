package Tugas.Anabul;

// Pembuat      : Mohammad Izza Hakiki - 24060123140139
// Tanggal      : 10 Mei 2025
// File         : Anabul.java
// Deskripsi    : Program untuk menyimpan Parent, Anabul

public abstract class Anabul {
    private String nama;

    public Anabul(){
        nama = "";
    }

    public Anabul (String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String n){
        nama = n;
    }
    
    public abstract void Gerak();

    public abstract void Bersuara();
}