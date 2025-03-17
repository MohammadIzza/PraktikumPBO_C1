// Pembuat      : Mohammad Izza Hakiki / 24060123140139
// Tanggal      : 14 Maret 2025
// File         : Dosen.java
// Deskripsi    : Class untuk menyimpan Dosen, turunan dari Pegawai

import java.time.LocalDate;

abstract class Dosen extends Pegawai{
    protected String Fakultas;

    public Dosen(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok, String Fakultas){
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok);
        this.Fakultas = Fakultas;
    }

    public String getFakultas(){
        return Fakultas;
    }

    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas        : " + getFakultas());
    }
}