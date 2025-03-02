/* Nama File   : Kendaraan.java
   Deskripsi   : berisi atribut dan method dalam class Kendaraan
   Pembuat     : Mohammad Izza Hakiki/24060123140139
   Tanggal     : 27/02/2025
*/

public class Kendaraan {
    //Atribut
    private String noPlat;
    private String jenis;

    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }
    
    public Kendaraan(String Plat, String Jenis){
        noPlat = Plat;
        jenis = Jenis;
    }

    //Selektor
    public String getNoPlat(){
        return noPlat;
    }
    public String getJenis(){
        return jenis;
    }

    //Mutator
    public void setNoPlat(String Plat){
        noPlat = Plat;
    }
    public void setJenis(String Jenis){
        jenis = Jenis;
    }


}
