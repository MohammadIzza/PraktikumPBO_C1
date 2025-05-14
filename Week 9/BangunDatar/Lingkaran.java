
// Pembuat      : Mohammad Izza Hakiki - 24060123140139
// Tanggal      : 10 Mei 2025
// File         : Lingkaran.java
// Deskripsi    : implementasi Lingkaran sebagai BangunDatar

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double getJejari() {
        return jejari;
    }
    
    public void setJejari(double jejari) {
        this.jejari = jejari;
    }
    
    @Override
    public double hitungLuas(){
        return 2*jejari*3.14;
    }

    @Override
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
