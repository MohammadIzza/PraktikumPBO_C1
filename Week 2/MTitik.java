/* Nama File   : MTitik.java
   Deskripsi   : Berisi contoh penggunaan class Titik untuk berbagai fungsi
   Pembuat     : Mohammad Izza Hakiki/24060123140139
   Tanggal     : 19/02/2025
*/

public class MTitik {
    public static void main(String[] args) {
        // Membuat objek Titik T1 dengan koordinat awal (0,0)
        Titik T1 = new Titik(0,0);
        System.out.println("Titik 1 Awal (T1) (0, 0)");
        T1.printTitik(); 

        // Mengubah nilai abscis dan ordinat Titik T1
        T1.setAbsis(3);  
        T1.setOrdinat(4); 
        System.out.println("Titik 1 setelah diubah: ");
        T1.printTitik();  

        // Menggeser Titik T1 sejauh (3, 4)
        T1.geser(3, 4);
        System.out.println("Titik 1 setelah digeser (3, 4): ");
        T1.printTitik(); 

        // Membuat Titik T2 yang mereferensikan T1
        Titik T2 = T1;
        System.out.println("Titik 2 (T2) yang mereferensikan Titik 1: ");
        T2.printTitik(); 

        // Mengubah nilai abscis dan ordinat Titik T1, yang akan mempengaruhi T2 juga
        T1.setAbsis(-10);
        T1.setOrdinat(10);
        System.out.println("Titik 1 setelah diubah, Titik 2 ikut berubah: ");
        T2.printTitik();  

        // Membuat Titik T3 menggunakan konstruktor dengan parameter
        Titik T3 = new Titik(2, 5);
        System.out.println("Titik 3 (T3) dengan koordinat (2, 5): ");
        T3.printTitik();  

        // Menampilkan jumlah objek Titik yang telah dibuat
        System.out.println("Jumlah Objek Titik yang telah dibuat: " + Titik.getCouterTitik());

        // Menentukan kuadran Titik T1
        System.out.println("Titik 1 berada di kuadran: " + T1.getKuadran());

        // Menghitung jarak Titik T1 ke pusat (0,0)
        System.out.println("Jarak Titik 1 ke titik pusat (0,0): " + T1.getJarakPusat());

        // Menghitung jarak antara Titik T1 dan Titik T3
        System.out.println("Jarak antara Titik 1 dan Titik 3: " + T1.getJarak(T3));

        // Merefleksikan Titik T1 terhadap sumbu X
        System.out.println("Titik 1 setelah refleksi terhadap sumbu X: ");
        T1.refleksiX();
        T1.printTitik();

        // Merefleksikan Titik T1 terhadap sumbu Y
        System.out.println("Titik 1 setelah refleksi terhadap sumbu Y: ");
        T1.refleksiY();
        T1.printTitik();

        // Mendapatkan hasil refleksi Titik T1 terhadap sumbu X dan Y
        Titik T1RefleksiX = T1.getRefleksiX();
        Titik T1RefleksiY = T1.getRefleksiY();

        // Menampilkan hasil refleksi
        System.out.println("Hasil refleksi Titik 1 terhadap sumbu X: ");
        T1RefleksiX.printTitik();
        System.out.println("Hasil refleksi Titik 1 terhadap sumbu Y: ");
        T1RefleksiY.printTitik();

        // Menggeser Titik T2 sejauh (2, 3)
        T2.geser(2, 3);
        System.out.println("Titik 2 setelah digeser (2, 3): ");
        T2.printTitik();
    }
}
