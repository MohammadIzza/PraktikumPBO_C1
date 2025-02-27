/* Nama File   : Titik.java
   Deskripsi   : berisi atribut dan method dalam class Titik
   Pembuat     : Mohammad Izza Hakiki/24060123140139
   Tanggal     : 19/02/2025
*/

public class Titik {
    /************** ATRIBUT **************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;
    /************** METHOD **************/
    
    // Konstruktor untuk membuat titik (0,0)
    public Titik(double absis, double  ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    // Konstruktor dengan parameter untuk membuat titik dengan nilai absis dan ordinat yang diberikan
    // public Titik(double x, double y) {
    //     this.absis = x;
    //     this.ordinat = y;
    // }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }
    
    public static int getCouterTitik(){
        return counterTitik;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }
    // menentukan kuadran 
    public int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return  1;
        }
        else if (absis < 0 && ordinat > 0) {
            return  2;
        }
        else if (absis < 0 && ordinat < 0){
            return 3;
        }
        else if (absis > 0 && ordinat < 0){
            return  4;
        }
        else {
            return  0;
        }
    }

    public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    public double getJarak(Titik T){
        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void refleksiX(){
        ordinat = ordinat*-1;
    }

    public void refleksiY(){
        absis = absis * -1;
    }


    // Merefleksikan titik terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // Merefleksikan titik terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // Metode untuk mencetak counterTitik
    public void printCounterTitik() {
        System.out.println(Titik.counterTitik); // Bisa menggunakan this.counterTitik, meskipun lebih baik menggunakan Titik.counterTitik
    }
}
