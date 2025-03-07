// File : Asersi2.java
// Deskripsi : Program untuk demo asersi, yang akan menolak input
// jari-jari lingkaran yang bernilai nol
// Nama : Mohammad Izza Hakiki 
// NIM : 24060123140139

//class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 1;
        
        // Asersi untuk memastikan jari-jari lebih besar dari nol
        if (jariJari <= 0){
            assert(jariJari <= 0):"jari-jari tidak boleh nol!!!";    
            /* Kesalahan ini terletak pada kondisioal, dikatakan bahwa Asersi ini untuk memastikan bahwa 
            Asersi harus memastikan jari jari lebih besar dari 0. sehingga harusnya kurang dari dan diberi if else
            */
        }
        else {
            Lingkaran l = new Lingkaran(jariJari);
            double kelilingLingkaran = l.hitungKeliling();
            System.out.println("keliling lingkaran = " + kelilingLingkaran);
        }
    }
}
