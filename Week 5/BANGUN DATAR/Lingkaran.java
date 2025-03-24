public class Lingkaran extends BangunDatar implements IResize {
    private double jariJari;

    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jariJari = diameter/2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    public double getJari(){
        return this.jariJari;
    }

    public void setJari(double jari){
        this.jariJari = jari;
    }
    @Override
    public double getLuas(){
        return this.jariJari*this.jariJari*Math.PI;
    }
    @Override
    public double getKeliling(){
        return Math.PI*jariJari;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("jari-jari: " + jariJari);
    }

    @Override
    // menambahkan ukuran menjadi 10% lebih besar 
    public void zoomIm(){
        jariJari = jariJari * 1.1;
    }
    
    @Override
    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut(){
        jariJari = jariJari * 0.9;
    }

    @Override
    // menskalakan ukuran menjadi sesuai inputan
    public void zoomIm(int percent ){
        jariJari = jariJari * percent/100;
    }

}
