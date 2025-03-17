// Pembuat      : Mohammad Izza Hakiki / 24060123140139
// Tanggal      : 14 Maret 2025
// File         : MPegawai.java
// Deskripsi    : Driver untuk Program Pegawai

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        System.out.println("DOSEN TETAP");
        DosenTetap dosenTetap1 = new DosenTetap("9545647548", "Mohammad Izza Hakiki", LocalDate.of(2001, 11, 23), LocalDate.of(2001, 16, 9), 200000000, "Fakultas Sains dan Matematika", "12345678910");
        dosenTetap1.printInfo();

        System.out.println("\nDOSEN TAMU");
        DosenTamu dosenTamu1 = new DosenTamu("9545647548", "Kiki", LocalDate.of(2001, 10, 3), LocalDate.of(2021, 6, 29), 200000000, "Fakultas Sains dan Matematika", "78647324", LocalDate.of(2030, 5, 1));
        dosenTamu1.printInfo();

        System.out.println("\nTENDIK");
        Tendik tendik1 = new Tendik("9545647548", "Izza", LocalDate.of(2005, 10, 3), LocalDate.of(2018, 3, 3), 200000000, "Akademik");
        tendik1.printInfo();
    }
}