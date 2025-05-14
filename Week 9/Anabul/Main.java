package Tugas.Anabul;

// Pembuat      : Mohammad Izza Hakiki - 24060123140139
// Tanggal      : 10 Mei 2025
// File         : Main.java
// Deskripsi    : Program untuk menyimpan Driver

public class Main {
    public static void main(String[] args) {
        Koleksi KoleksiAnabul = new Koleksi();
        Kucing kucing1 = new Kucing("Kucing 1");
        Kucing kucing2 = new Kucing("Kucing 2");
        Kucing kucing3 = new Kucing("Kucing 3");
        Burung burung1 = new Burung("Burung 1");
        Burung burung2 = new Burung("Burung 2");
        Burung burung3 = new Burung("Burung 3");
        Anjing anjing1 = new Anjing("Anjing 1");
        Anjing anjing2 = new Anjing("Anjing 2");
        Anjing anjing3 = new Anjing("Anjing 3");
        Anjing anjing4 = new Anjing("Anjing 4");

        KoleksiAnabul.add(kucing1);
        KoleksiAnabul.add(kucing2);
        KoleksiAnabul.add(kucing3);
        KoleksiAnabul.add(burung1);
        KoleksiAnabul.add(burung2);
        KoleksiAnabul.add(burung3);
        KoleksiAnabul.add(anjing4);
        KoleksiAnabul.add(anjing1);
        KoleksiAnabul.add(anjing2);
        KoleksiAnabul.add(anjing3);

        System.out.println("Koleksi Anaabul:");
        KoleksiAnabul.showAll();
    }
}
