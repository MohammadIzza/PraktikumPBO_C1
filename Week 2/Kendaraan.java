/* Nama File   : Kendaraan.java
   Deskripsi   : berisi atribut dan method dalam class Kendaraan
   Pembuat     : Mohammad Izza Hakiki/24060123140139
   Tanggal     : 27/02/2025
*/

public class Kendaraan {
    // properti 
    private int noPlat;
    private String jenis;

    
    // konstruktor tanpa parameter 
    public Kendaraan(){
        noPlat = 0;
        jenis = "";
    }

    // konstruktor dengan parameter 
    public Kendaraan(int noPlat, String jenis ){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // selector 
    public int getNoPlat(){
        return noPlat;
    }

    public String getJenisKendaraan(){
        return jenis;
    }

    // Mutator
    public void setNoPlat(int id){
        noPlat = id;
    }

    public void setJenisKendaraan(String NAMA){
        jenis = NAMA;
    }

}   