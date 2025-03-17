// Pembuat      : Mohammad Izza Hakiki / 24060123140139
// Tanggal      : 14 Maret 2025
// File         : DosenTetap.java
// Deskripsi    : Class untuk menyimpan DosenTetap, turunan dari Dosen

import java.time.LocalDate;
import java.time.Period;


public class DosenTetap extends Dosen{
    private String NIDN;

    public DosenTetap(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok, String Fakultas, String NIDN) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    public LocalDate getBUP(){
        return getTanggalLahir().plusYears(65).withDayOfMonth(1).plusMonths(1);
    }

    public String getMasaKerja(){
        Period period = Period.between(TMT, LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }
    
    public double getTunjangan(){
        int masaKerja = Period.between(TMT, LocalDate.now()).getYears();
        return 0.02 * masaKerja * getGajiPokok();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN                : " + NIDN);
        System.out.println("Jabatan           : Dosen Tetap");
        System.out.println("BUP                 : " + DateFormat(getBUP()));
        System.out.println("Masa Kerja          : " + getMasaKerja());
        System.out.println("Tunjangan           : 2% x " + Period.between(TMT, LocalDate.now()).getYears() + " x Rp " + String.format("%,.2f", getGajiPokok()) + " = Rp " + getTunjangan());
    }
}