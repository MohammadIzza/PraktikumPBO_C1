/**
 *
 * @author Mohammad Izza Hakiki
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
        
    }
    
    private String getBunyi(){
        return bunyi;
    }
    
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
        
    }
    
    private boolean isMenusuk(){
        return menusuk;
    }
    
    private void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
        
    }
    
    public void menembak(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print(getBunyi() + ' ');
        }
        System.out.println("");
    }
    
    public void menembak() {
        System.out.print(getBunyi() + '\n');
        setPeluru(getPeluru() - 1);
        System.out.println("sisa peluru: " + getPeluru());
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet terpasang");
    }
    
    public String menusuk(){
        if (isMenusuk()){
            return "Jleb";
        }
        else {
            return "gagal, bayonet belum dipasang";
        }
    }
}
