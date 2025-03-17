// Pembuat      : Mohammad Izza Hakiki / 24060123140139
// Tanggal      : 14 Maret 2025
// File         : Tendik.java
// Deskripsi    : Class untuk menyimpan Tendik, turunan dari Pegawai

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    protected String bidang;
    
    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang){
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang(){
        return bidang;
    }

    public LocalDate getBUP(){
        return getTanggalLahir().plusYears(55).withDayOfMonth(1).plusMonths(1);
    }

    public int getMasaKerja() {
        return Period.between(TMT, LocalDate.now()).getYears();
    }
    
    public double getTunjangan(){
        return 0.01 * getMasaKerja() * getGajiPokok();
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Bidang Tempat Kerja : " + getBidang());
        System.out.println("BUP                 : " + DateFormat(getBUP()));
        System.out.println("Tunjangan           : 1% x " + Period.between(TMT, LocalDate.now()).getYears() + " x Rp " + String.format("%,.2f", getGajiPokok()) + " = Rp " + getTunjangan());
    }
}