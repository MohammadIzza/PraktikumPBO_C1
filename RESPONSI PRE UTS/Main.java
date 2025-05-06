/* Nama File    : Main.java
 * Deskripsi    : Program utama yang berisi main class untuk menjalankan aplikasi
 * Pembuat      : Mohammad Izza Hakiki/24060123140139
 * Tanggal      : 28 Maret 2025
 */


public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek fakultas
        Fakultas fakultasTeknik = new Fakultas("FT", 900000, 6000000);
        Fakultas fakultasEkonomi = new Fakultas("FEB", 7500000, 5500000);
        Fakultas fakultasSains = new Fakultas("FSM", 8500000, 4500000);

        // Membuat beberapa mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Kiki", "Kiki@gmail.com", "M12345", 3, fakultasTeknik);
        Mahasiswa mahasiswa2 = new Mahasiswa("Izza", "Izza@gmail.com", "M54321", 2, fakultasEkonomi);
        Mahasiswa mahasiswa3 = new Mahasiswa("Izza Hakiki", "IzzaGanteng@gmail.com", "M4", 1, fakultasSains);

        // Membuat beberapa karyawan
        Dosen dosen1 = new Dosen("Rismi", "rismi@gmail.com", "D1234", 5, fakultasTeknik);
        Tendik tendik1 = new Tendik("Bowo", "bowo@gmail.com", "T0000", 3);

        // Menampilkan informasi
        System.out.println("\n================================================");
        System.out.println("          INFORMASI CIVITAS AKADEMIK            ");
        System.out.println("================================================");
        
        System.out.println("\n----------------- Data Mahasiswa ----------------");
        mahasiswa1.tampilkanInformasi();
        System.out.println("\n------------------------------------------------");
        mahasiswa2.tampilkanInformasi();
        System.out.println("\n------------------------------------------------");
        mahasiswa3.tampilkanInformasi();
        
        System.out.println("\n------------------- Data Dosen ------------------");
        dosen1.tampilkanInformasi();
        System.out.println("\n------------------------------------------------");
        
        System.out.println("\n----------- Data Tenaga Kependidikan -----------");
        tendik1.tampilkanInformasi();
        System.out.println("\n------------------------------------------------");

        // Menampilkan jumlah instansi
        System.out.println("\n================================================");
        System.out.println("        REKAP JUMLAH CIVITAS AKADEMIK          ");
        System.out.println("================================================");
        System.out.println("Jumlah Mahasiswa : " + Mahasiswa.getCount() + " orang");
        System.out.println("Jumlah Dosen     : " + Dosen.getCount() + " orang");
        System.out.println("Jumlah Tendik    : " + Tendik.getCount() + " orang");
        System.out.println("------------------------------------------------");
        System.out.println("Total Civitas    : " + (Mahasiswa.getCount() + Dosen.getCount() + Tendik.getCount()) + " orang");
        System.out.println("================================================");
    }
}
