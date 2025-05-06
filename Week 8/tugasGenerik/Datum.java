
public class Datum<T> {
    private T isi;

    public Datum(){
        this.isi = null;
    }
    public Datum(T isi){
        this.isi = isi;
    }
    public T getIsi() {
        return isi;
    }
    public void setIsi(T isi) {
        this.isi = isi;
    }
}
