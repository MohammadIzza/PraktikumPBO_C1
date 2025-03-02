/* Nama File    : MMahasiswa.java
   Deskripsi    : Main class Mahasiswa
   Pembuat     : Mohammad Izza Hakiki/24060123140139
   Tanggal     : 27/02/2025
 */

public class MMahasiswa {
    public static void main(String[] args){
        //Inisialisasi Objek
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Dosen D1 = new Dosen("999", "Nurdin Bahtiar", "Informatika");
        Kendaraan K1 = new Kendaraan("K 9999 KE", "Motor");
        Mahasiswa M1 = new Mahasiswa("24060123140139", "Mohammad Izza Hakiki", "Informatika", D1, K1);
        
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("\nJumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
        
    }
}
