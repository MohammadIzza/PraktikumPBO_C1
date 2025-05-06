
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
    
    public String getBunyi(){
        return bunyi;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
        
    }
    
    public boolean isMenusuk(){
        return menusuk;
    }
    
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
        
    }
    
    
}

