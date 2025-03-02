
import java.util.ArrayList;

/* Nama File   : Mahasiswa.java
   Deskripsi   : berisi atribut dan method dalam class Mahasiswa
   Pembuat     : Mohammad Izza Hakiki/24060123140139
   Tanggal     : 27/02/2025
*/

public class Mahasiswa {
    // atribut 
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
    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali, Kendaraan kendaraan ){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
    }

    //Selektor
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getProdi(){
        return prodi;
    }
    public Dosen getDosenwali(){
        return dosenWali;
    }
    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    //Mutator
    public void setNim(String NIM){
        nim = NIM;
    }
    public void setNama(String NAMA){
        nama = NAMA;
    }
    public void setProdi(String PRODI){
        prodi = PRODI;
    }
    public void setDosenWali(Dosen dosenwali){
        dosenWali = dosenwali;
    }
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    //Menambahkan mata kuliah ke dalam listMatkul
    public void addMatkul (MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    //Menghitung jumlah SKS dari listMatkul
    public int getJumlahSKS(){
        int sum = 0;
        for(MataKuliah m : listMatkul){
            sum += m.getSks();
        }
        return sum;
    }

    //Menghitung jumlah mata kuliah yang diambil
    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    //Menampilkan data mahasiswa
    public void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    //Menampilkan detail mahasiswa
    public void printDetailMhs(){
        System.out.println("Detail Mahasiswa: ");
        printMhs();
        int i;

        System.out.println("Mata Kuliah yang diambil: ");
        for(i = 0 ; i < listMatkul.size() ; i++){
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println("Data Dosen Wali: ");
        System.out.println("NIP: " + dosenWali.getNip());
        System.out.println("Nama: " + dosenWali.getNama());
        System.out.println("Prodi: " + dosenWali.getProdi());
        System.out.println("Data Kendaraan: ");
        System.out.println("No Plat: " + kendaraan.getNoPlat());
        System.out.println("Jenis: " + kendaraan.getJenis());
    }
}

    
