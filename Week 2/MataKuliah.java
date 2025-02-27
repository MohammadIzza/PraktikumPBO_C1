/* Nama File   : MataKuliah.java
   Deskripsi   : berisi atribut dan method dalam class MataKuliah
   Pembuat     : Mohammad Izza Hakiki/24060123140139
   Tanggal     : 27/02/2025
*/

public class MataKuliah {
    // properti 
    private int idMatKul;
    private String nama;
    private int sks;

    
    // konstruktor tanpa parameter 
    public MataKuliah(){
        idMatKul = 0;
        nama = "";
        sks = 0;
    }

    // konstruktor dengan parameter 
    public MataKuliah(int idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // selector 
    public int getIdMatkul(){
        return idMatKul;
    }

    public String getNamaMatkul(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    // Mutator
    public void setIdMatkul(int id){
        idMatKul = id;
    }

    public void setNamaMatkul(String NAMA){
        nama = NAMA;
    }

    public void setSks(int p){
        sks = p;
    }
}   