/* Nama File    : Petani.java
 * Deskripsi    : Class Petani, subclass Manusia
 * Pembuat      : Mohammad Izza Hakiki/24060123140139
 * Tanggal      : 24 Maret 2025
 */


import java.time.LocalDate;

public class Petani extends Manusia {
    private String asal_kota;
    private static int counterPetani;

    // Konstruktor
    public Petani() {
        super();
        asal_kota = "";
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Selektor (getter)
    public String getAsalKota() {
        return asal_kota;
    }
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Mutator (setter)
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }
    public static void setCounterPetani(int counterPetani) {
        Petani.counterPetani = counterPetani;
    }

    // 24060123130081
    public int hitungMasaKerja() {
        return (LocalDate.now().getYear() - tgl_mulai_kerja.getYear()) + 0;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=====================================");
        super.cetakInfo();
        System.out.println("Asal Kota           : " + getAsalKota());
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("=====================================");
    }

    public double hitungPajak() {
        return 0;
    }
}
