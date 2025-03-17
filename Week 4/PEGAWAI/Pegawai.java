// Pembuat      : Mohammad Izza Hakiki / 24060123140139
// Tanggal      : 14 Maret 2025
// File         : Pegawai.java
// Deskripsi    : Class untuk menyimpan Pegawai, Pegawai merupakan parent

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

abstract class Pegawai {
    protected String NIP;
    protected String Nama;
    protected LocalDate TanggalLahir;
    protected LocalDate TMT;
    protected double GajiPokok;

    protected String DateFormat(LocalDate tanggal){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy").withLocale(Locale.forLanguageTag("ID"));
        return tanggal.format(formatter);
    }

    public Pegawai(){
        this.NIP = "";
        this.Nama = "";
        this.TanggalLahir = null;
        this.TMT = null;
        this.GajiPokok = 0.0;
    }

    public Pegawai(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok){
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.GajiPokok= GajiPokok;
    }

    public String getNIP(){
        return NIP;
    }

    public String getNama(){
        return Nama;
    }

    public LocalDate getTanggalLahir(){
        return TanggalLahir;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public double getGajiPokok(){
        return GajiPokok;
    }
    
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setTanggalLahir(LocalDate TanggalLahir){
        this.TanggalLahir = TanggalLahir;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }


    public void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }

    public String hitungMasaKerja(){
        if (TMT == null){
            return "TMT NULL";
        }
        Period period = Period.between(TMT, LocalDate.now());
        return period.getYears() + " Tahun " + period.getMonths() + " Bulan";
    }

    public void printInfo(){
        System.out.println("NIP                 : " + getNIP());
        System.out.println("Nama                : " + getNama());
        System.out.println("Tanggal Lahir       : " + DateFormat(getTanggalLahir()));
        System.out.println("TMT                 : " + DateFormat(getTMT()));
        System.out.println("Gaji Pokok          : Rp. " + String.format("%,.2f", getGajiPokok()));
    }

}