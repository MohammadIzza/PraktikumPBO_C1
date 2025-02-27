
// import java.util.ArrayList;

/* Nama File   : Dosen.java
   Deskripsi   : berisi atribut dan method dalam class Dosen
   Pembuat     : Mohammad Izza Hakiki/24060123140139
   Tanggal     : 27/02/2025
*/

public class Dosen {
    // properti 
    private String nip;
    private String nama;
    private String prodi;

    // ArrayList<MataKuliah> listMatkul; 
    // private Dosen doseWali;
    // private Kendaraan kendaraan;
    
    // konstruktor tanpa parameter 
    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
    }

    // konstruktor dengan parameter 
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // selector 
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    // Mutator
    public void setNip(String NIP){
        nip = NIP;
    }

    public void setNama(String NAMA){
        nama = NAMA;
    }

    public void setProdu(String PRODI){
        prodi = PRODI;
    }
}   