// Nama File : MGaris.java
// Deskripsi : berisi atribut dan method dalam class Garis
// Pembuat   : Mohammad Izza Hakiki/24060123140139
// Tanggal   : 22 Februari 2025 

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek Garis G1
        Garis G1 = new Garis();
        System.out.println("Garis G1:");
        G1.printGaris();
        
        // Mengubah titik awal dan titik akhir untuk G1
        G1.getTitikAwal().setAbsis(4);
        G1.getTitikAwal().setOrdinat(2);
        G1.getTitikAkhir().setAbsis(10);
        G1.getTitikAkhir().setOrdinat(10);
        
        // Menampilkan informasi Garis G1
        G1.printGaris();
        System.out.println("Panjang Garis G1: " + G1.getPanjang());
        System.out.println("Gradien Garis G1: " + G1.getGradien());
        G1.getTitikTengah().printTitik();

        // Membuat objek Garis G2
        Garis G2 = new Garis();
        System.out.println("\nGaris G2:");
        G2.printGaris();
        
        // Mengubah titik awal dan titik akhir untuk G2
        G2.getTitikAwal().setAbsis(4);
        G2.getTitikAwal().setOrdinat(2);
        G2.getTitikAkhir().setAbsis(6);
        G2.getTitikAkhir().setOrdinat(8);
        
        // Menampilkan informasi Garis G2
        G2.printGaris();
        System.out.println("Panjang Garis G2: " + G2.getPanjang());
        System.out.println("Gradien Garis G2: " + G2.getGradien());
        G2.getTitikTengah().printTitik();

        // Mengecek apakah G1 dan G2 sejajar atau tegak lurus
        System.out.println("\nApakah G1 & G2 Sejajar? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 & G2 Tegak Lurus? " + G1.isTegakLurus(G2));

        // Menampilkan persamaan garis G1 dan G2
        System.out.println("\nPersamaan Garis G1: " + G1.getEqual());
        System.out.println("Persamaan Garis G2: " + G2.getEqual());
    }
}
