// Pembuat      : Mohammad Izza Hakiki / 24060123140139
// Tanggal      : 14 Maret 2025
// File         : DosenTamu.java
// Deskripsi    : Class untuk menyimpan DosenTamu, turunan dari Dosen   

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen{
    private int masaKontrak; 
    private String NIDK;

    public DosenTamu(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok, String Fakultas, String NIDK, LocalDate tanggalAkhirKontrak) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.masaKontrak = hitungMasaKontrak(TMT, tanggalAkhirKontrak);
    }

    private int hitungMasaKontrak(LocalDate TMT, LocalDate tanggalAkhirKontrak) {
        Period period = Period.between(TMT, tanggalAkhirKontrak);
        return period.getYears() * 12 + period.getMonths();
    }

    public int getMasaKontrak() {
        return masaKontrak;
    }

    public String getNIDK(){
        return NIDK;
    }   

    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    protected String getMasaKerja(){
        Period period = Period.between(TMT, LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    public double hitungTunjangan(){
        int tahunMulai = getTMT().getYear();
        int tahunSekarang = LocalDate.now().getYear();
        int masaKerja = tahunSekarang - tahunMulai;
        return 0.02 * masaKerja * getGajiPokok();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDK                 : " + getNIDK());
        System.out.println("Jabatan              : Dosen Tamu");
        System.out.println("Masa Kerja           : " + getMasaKerja());
        System.out.println("Masa Kontrak Berakhir: " + getMasaKontrak() + " Bulan");
        System.out.println("Tunjangan            : 2.5% x " + Period.between(TMT, LocalDate.now()).getYears() + " x Rp " + String.format("%,.2f", getGajiPokok()) + " = Rp " + hitungTunjangan());
    }
}
