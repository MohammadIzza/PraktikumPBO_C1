import java.text.DecimalFormat;
// Nama File : Garis.java
// Deskripsi : berisis atribut dan method dalam class Garis
// Pembuat   : Mohammad Izza Hakiki/24060123140139
// Tanggal   : 22 Februari 2025 

public class Garis {
    /*************** Atribut *****************/
    Titik TitikAwal;
    Titik TitikAkhir;
    static int counterGaris = 0;

    /*************** Method *****************/
    // Konstruktor untuk membuat titik (0,0)
    Garis() {
        this.TitikAwal = new Titik(0,0);
        this.TitikAkhir = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik T1, Titik T2) {
        this.TitikAwal = T1;
        this.TitikAkhir = T2;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    // Selektor untuk mengembalikkan titik awal
    Titik getTitikAwal(){
        return TitikAwal;
    }

    // Selektor untuk mengembalikkan titik akhir
    Titik getTitikAkhir() {
        return TitikAkhir;
    }

    // Mutator untuk set titik awal
    void setTitikAwal(Titik T) {
        TitikAwal = T;
    }

    // Mutator untuk set titik akhir
    void setTitikAkhir(Titik T) {
        TitikAkhir = T;
    }

    // Menghitung panjang garis
    double getPanjang() {
        return Math.sqrt(Math.pow(TitikAkhir.getAbsis() - TitikAwal.getAbsis(), 2) + Math.pow(TitikAkhir.getOrdinat() - TitikAwal.getOrdinat(), 2));
    }
    
    // Menghitung gradien garis
    double getGradien() {
        return (TitikAkhir.getOrdinat() - TitikAwal.getOrdinat()) / (TitikAkhir.getAbsis() - TitikAwal.getAbsis());
    }

    // Mendapatkan Titik tengah dari garis
    Titik getTitikTengah() {
        double x = (TitikAwal.getAbsis() + TitikAkhir.getAbsis()) /2;
        double y = (TitikAwal.getOrdinat() + TitikAkhir.getOrdinat()) /2;
        return new Titik(x,y);
    }
    // print garis
    void printGaris() {
        System.out.println("Garis dengan Titik Awal: (" + TitikAwal.getAbsis() + ", " + TitikAwal.getOrdinat() + ") dan Titik Akhir: (" + TitikAkhir.getAbsis() + ", " + TitikAkhir.getOrdinat() + ")");
    }

    // 2 garis sejajar atau tidak (true jika sejajar dan false jika tidak)
    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    // Apakah Garis tegak lurus dengan garis lainnya
    boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c
    String getEqual() {
        DecimalFormat df = new DecimalFormat("#.##");
        double m = this.getGradien();
        Titik c = TitikAwal;
        return "y = " + df.format(m) + "x + " + df.format(c.getOrdinat() - m * c.getAbsis());
    }
}
