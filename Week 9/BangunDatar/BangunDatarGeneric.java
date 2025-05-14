// Pembuat      : Mohammad Izza Hakiki - 24060123140139
// Tanggal      : 10 Mei 2025
// File         : BangunDatarGenericTest.java
// Deskripsi    : kelas konstruksi generic untuk BangunDatar

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set (T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }
    
    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

}
