public class MBangunDatar {
    public static void main(String[] args) {

        // Membuat Objek Bangun Datar dengan type reference ke bangundatar
        // jadi jika menggunakan type superclass tidak bisa mengakses method absark, karena belum di overide 
        BangunDatar B1 = new Persegi(18, "B1 Bangun datar Magenta", "Tebal");
        B1.printInfo();
        // B1.getSisi(); ini tidak bisa karena merupakan method di subclass, padahal kita menggunakn type superclas

        // mencoba resize dengan superclass padahal method nya ada di subclass
        System.out.println("Sisi dari B1 yang belum di Resaze : " + ((Persegi)B1).getSisi());
        ((Persegi)B1).zoomIm();
        System.out.println("Sisi dari B1 setelah di Resize (ZoomIm) : " + ((Persegi)B1).getSisi());
        System.out.println();

        // Membuat Objek Persegi dengan type Persegi
        Persegi P1 = new Persegi(4, "P1 Persegi Biru", "Bold");
        P1.printInfo();
        System.out.println();
        
        // Membuat Objek Lingkaran dengan type Lingkaran 
        Lingkaran L1 = new Lingkaran(3, "L1 Lingkaran Kuning", "Normal");
        L1.printInfo();
        System.out.println();

        BangunDatar.printCounterBangunDatar();

        // 
        System.out.println("Apakah Luas P1 apakah sama dengan L1 ? " + P1.isEqualLuas(L1));
        System.out.println("Apakah Keliling P1 apakah sama dengan L1 ? " + P1.isEqualKeliling(L1));

    }
}