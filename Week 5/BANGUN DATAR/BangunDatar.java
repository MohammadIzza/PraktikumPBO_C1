public abstract  class BangunDatar{
    protected int jmlsisi;
    protected String warna;
    protected String border;
    private  static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlsisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
    public int getJmlSisi(){
        return jmlsisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlsisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }
    

    public void printInfo(){
        System.out.println("jumlah sisi : " + jmlsisi);
        System.out.println("warna : " + warna);
        System.out.println("Border : " + border);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }

    public static void printCounterBangunDatar(){
        System.out.println("jumlah objek bangun datar : " + counterBangunDatar);
    }
    
    // abtrak 
    public abstract double getLuas();

    public abstract double getKeliling();

    // Membuat method yang memanfaatkan superclass
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}


//JAWABAN
/*Tidak bisa karena pada class BangunDatar, Atribut atributnya bersifat private, 
  Jadi tidak bisa diakses secara langsung. Jika ingin mengaksesnya harus menggunakan konstruktor super() */
