
// Pembuat      : Mohammad Izza Hakiki - 24060123140139
// Tanggal      : 10 Mei 2025
// File         : BangunDatarGeneric.java
// Deskripsi    : kelas konstruksi generic untuk BangunDatar

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        Persegi p = new Persegi(2);
        PersegiPanjang pp = new PersegiPanjang(2, 4);
        Segitiga s = new Segitiga(5, 2);

        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);

        System.out.println("Luas Lingkaran : " + bdg.hitungLuas());
        System.out.println("keliling Lingkaran : " + bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName() + "\n");

        BangunDatarGeneric<Persegi> bdg2 = new BangunDatarGeneric<Persegi>();
        bdg2.set(p);

        System.out.println("Luas Persegi : " + bdg2.hitungLuas());
        System.out.println("keliling Persegi : " + bdg2.hitungKeliling());
        System.out.println("tipe generic : " + bdg2.get().getClass().getName() + "\n");

        BangunDatarGeneric<PersegiPanjang> bdg3 = new BangunDatarGeneric<PersegiPanjang>();
        bdg3.set(pp);

        System.out.println("Luas Persegi Panjang : " + bdg3.hitungLuas());
        System.out.println("keliling Persegi Panjang: " + bdg3.hitungKeliling());
        System.out.println("tipe generic : " + bdg3.get().getClass().getName() + "\n");

        BangunDatarGeneric<Segitiga> bdg4 = new BangunDatarGeneric<Segitiga>();
        bdg4.set(s);

        System.out.println("Luas Segitiga : " + bdg4.hitungLuas());
        System.out.println("keliling Segitiga: " + bdg4.hitungKeliling());
        System.out.println("tipe generic : " + bdg4.get().getClass().getName() + "\n");
    }   
}
