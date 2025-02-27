
import java.util.ArrayList;

/* Nama File   : Mahasiswa.java
   Deskripsi   : berisi atribut dan method dalam class Mahasiswa
   Pembuat     : Mohammad Izza Hakiki/24060123140139
   Tanggal     : 27/02/2025
*/

public class Mahasiswa {
    // properti 
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    // konstruktor tanpa parameter 
    public Mahasiswa(){
        nim = "";
        nama = "";
        prodi = "";
        listMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    // konstruktor dengan parameter 
    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali, Dosen dosenWali, Kendaraan kendaraan ){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
    }

    
