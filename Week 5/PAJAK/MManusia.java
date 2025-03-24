/* Nama File    : MManusia.java
 * Deskripsi    : Main class Manusia
 * Pembuat      : Mohammad Izza Hakiki/24060123140139
 * Tanggal      : 24 Maret 2025
 */

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        // Create objects with new names
        PNS p1 = new PNS("Izza", LocalDate.of(2006, 4, 1), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Kiki", LocalDate.of(2000, 1, 1), "Jl. Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Mohammad Izza", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), null, 10000000, "198004212010041002");

        p2.setAlamat("Jl. Panorama 111 Tembalang");
        
        System.out.println("\n========== STATISTIK MANUSIA ==========");
        System.out.println("Total Manusia\t: " + Manusia.getCounterMns() + " orang");
        System.out.println("Total PNS\t: " + PNS.getCounterPNS() + " orang");
        System.out.println("Total Pengusaha\t: " + Pengusaha.getCounterPengusaha() + " orang");
        System.out.println("Total Petani\t: " + Petani.getCounterPetani() + " orang");
        
        System.out.println("\n========== INFORMASI PAJAK ==========");
        System.out.printf("Pajak PNS (%s)\t: Rp %,.2f%n", p1.getNama(), p1.hitungPajak());
        System.out.printf("Pajak Pengusaha (%s)\t: Rp %,.2f%n", pe1.getNama(), pe1.hitungPajak());
        System.out.printf("Pajak Petani (%s)\t: Rp %,.2f%n", pt1.getNama(), pt1.hitungPajak());
        
        System.out.println("\n========== MASA KERJA ==========");
        System.out.printf("%-10s\t: %d tahun%n", p1.getNama(), p1.hitungMasaKerja());
        System.out.printf("%-10s\t: %d tahun%n", pe1.getNama(), pe1.hitungMasaKerja());
        System.out.printf("%-10s\t: %d tahun%n", pt1.getNama(), pt1.hitungMasaKerja());
        
        System.out.println("\n========== INFORMASI LENGKAP ==========");
        p1.cetakInfo();
        System.out.println("----------------------------------------");
        p2.cetakInfo();
        System.out.println("----------------------------------------");
        pe1.cetakInfo();
        System.out.println("----------------------------------------");
        pt1.cetakInfo();
    }
}

