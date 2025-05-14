package Tugas.Koleksi;

// Pembuat      : Mohammad Izza Hakiki - 24060123140139
// Tanggal      : 10 Mei 2025
// File         : koleksi.java
// Deskripsi    : impelentasi koleksi karakter


import java.util.ArrayList;

public class Koleksi {
    private ArrayList<Character> wadah; 
    private int nbelm; 

    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public Koleksi(int n) {
        wadah = new ArrayList<>(n);
        nbelm = 0;
    }

    public Character getIsi(int X) { 
        if (X >= 0 && X < nbelm) {
            return wadah.get(X);
        } 
        else {
            System.err.println("Indeks " + X + " di luar batas koleksi");
            return null;
        }
    }


    public void setIsi(int X, Character e) {
        if (X >= 0 && X < nbelm) {
            wadah.set(X, e);
        } 
        else {
            System.err.println("Indeks " + X + " di luar batas koleksi");
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int n) {
        if (n < 0) {
            System.err.println("Ukuran koleksi tidak boleh negatif");
            return;
        }

        if (n < this.nbelm) {
            while (wadah.size() > n) {
                wadah.remove(wadah.size() - 1);
            }
        } 
        
        else if (n > this.nbelm) {
            while (wadah.size() < n) {
                wadah.add('\0'); 
            }
        }
        this.nbelm = n;
    }


    public void add(Character e) {
        wadah.add(e);
        nbelm = wadah.size();
    }

 
    public void delete(Character e) {
        boolean removed = wadah.remove(e);
        if (removed) {
            nbelm = wadah.size();
        }
    }

    public void showAll() {
        if (nbelm == 0) {
            System.out.println("Koleksi Kosong");
        }
        else {
            System.out.print("elemen koleksi Koleksi : ");
            for (int i = 0; i < nbelm; i++) {
                System.out.print(wadah.get(i));
                if (i < nbelm - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}