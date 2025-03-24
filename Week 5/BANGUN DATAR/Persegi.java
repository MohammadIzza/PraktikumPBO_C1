public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    @Override
    public double getLuas(){
        return this.sisi * this.sisi;
    }

    @Override
    public double getKeliling(){
        return 4*(this.sisi);
    }

    public double getDiagonal(){
        return this.sisi*(Math.sqrt(2));
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    @Override
    // menambahkan ukuran menjadi 10% lebih besar 
    public void zoomIm(){
        sisi = sisi * 1.1;
    }
    
    @Override
    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    // menskalakan ukuran menjadi sesuai inputan
    public void zoomIm(int percent ){
        sisi = sisi * percent/100;
    }

    
}
