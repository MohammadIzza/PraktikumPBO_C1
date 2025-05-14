package Tugas.Koleksi;

// Pembuat      : Mohammad Izza Hakiki - 24060123140139
// Tanggal      : 10 Mei 2025
// File         : main.java
// Deskripsi    : program untuk simulasi file Koleksi

public class main {
    public static void main(String[] args) {
        Koleksi k = new Koleksi(10);

        System.out.println("Ukuran Koleksi: " + k.getSize());
        k.showAll();

        System.out.println("\n===== ADD ELEMEN =====");
        k.add('K');
        k.add('H');
        k.add('O');
        k.add('I');
        k.add('R');
        k.add('U');
        k.add('L');
        k.add('_');
        k.add('N');
        k.add('_');
        System.out.println("Ukuran Koleksi Sekarang: " + k.getSize());
        k.showAll();

        System.out.println("\n\n===== GET ISI KOLEKSI =====");
        System.out.println("Elemen ke-0: " + k.getIsi(0)); 
        System.out.println("Elemen ke-5: " + k.getIsi(5)); 
        System.out.println("Elemen ke-7: " + k.getIsi(7)); 
        System.out.println("Elemen ke-10: " + k.getIsi(10));


        System.out.println("\n===== SET ISI KOLEKSI =====");
        System.out.println("SET ISI ELEMEN ke 1, 8, dan 10 di KOLEKSI: ");
        k.setIsi(1, 'O');
        k.setIsi(8, '&');
        k.setIsi(10, 'O');
        k.showAll();

        System.out.println("\n\n===== DELETE ELEMEN KOLEKSI =====");
        System.out.println("DELETE ELEMEN K dan O di KOLEKSI: ");
        k.delete('K');
        k.delete('O');
        System.out.println("ukuran Koleksi Sekarang: " + k.getSize());
        k.showAll();

        System.out.println("\nDELETE ELEMEN B di KOLEKSI: ");
        k.delete('B');
        System.out.println("Ukuran Koleksi Sekarang: " + k.getSize());
        k.showAll();

        System.out.println("\n\n===== SET UKURAN KOLEKSI =====");
        k.setSize(12); 
        k.showAll();
        System.out.println("\nUkuran Koleksi Sekarang: " + k.getSize());
        System.out.println("Menampilkan elemen ke-10: " + k.getIsi(10));  

        System.out.println("\nMENAMBAH ELEMEN F KE KOLEKSI: ");
        k.add('F');
        k.showAll();
        System.out.println("\nUkuran Koleksi Sekarang: " + k.getSize());

        System.out.println("\nSET SIZE 7 di KOLEKSI: ");
        k.setSize(7); 
        k.showAll();
        System.out.println("\nUkuran Koleksi Sekarang: " + k.getSize());
        
        System.out.println("\nSET SIZE -2 di KOLEKSI: ");
        k.setSize(-2); 
        k.showAll();
        System.out.println("\nUkuran Koleksi Sekarang: " + k.getSize());

    }
}
