/* Nama File   : Titik.java
   Deskripsi   : berisi atribut dan method dalam class Titik
   Pembuat     : Mohammad Izza Hakiki/24060123140139
   Tanggal     : 19/02/2025
*/

public class Titik {
    /************** ATRIBUT **************/
    double absis;
    double ordinat;
    static int counterTitik = 0;
    /************** METHOD **************/
    
    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    
    // Konstruktor dengan parameter untuk membuat titik dengan nilai absis dan ordinat yang diberikan
    Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }
    
    static int getCouterTitik(){
        return counterTitik;
    }

    // Mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }
    // menentukan kuadran 
    int getKuadran(){
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

    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    double getJarak(Titik T){
        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    void refleksiX(){
        ordinat = ordinat*-1;
    }

    void refleksiY(){
        absis = absis * -1;
    }


    // Merefleksikan titik terhadap sumbu X
    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // Merefleksikan titik terhadap sumbu Y
    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // Metode untuk mencetak counterTitik
    void printCounterTitik() {
        System.out.println(Titik.counterTitik); // Bisa menggunakan this.counterTitik, meskipun lebih baik menggunakan Titik.counterTitik
    }
}
