/**
 *
 * @author Mohammad Izza Hakiki
 */
public class KontrolSenjata {
    private Senjata s;
    
    public KontrolSenjata(Senjata s) {
        this.s = s;
    }
    
    public boolean isAddPeluru() {
        return true;
    }
    
    public int isPeluru(int jumpPeluru) {
        return s.getPeluru();
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        
        if(s.getPeluru() <= 0) {
            System.out.println("Gagal tembak, Peluru Habis");
            return;
        }
        for(int i = 0; i < jumlah; i++) {
            if(s.getPeluru() > 0) {
             System.err.println(s.getBunyi()); 
             s.setPeluru(s.getPeluru()-1);
            }
            else{
            System.out.println("Gagal tembak, Peluru Habis");
            }
        }
            System.out.println("Sisa peluru: " + s.getPeluru());
    }
    public String menusuk() {
        if (s.isMenusuk()){
            return "Jleb";
        }
        else {
            return "gagal, bayonet belum dipasang";
        }
    }
    
    public void pasangBayonet(){
        s.setMenusuk(true);
        System.out.println("Bayonet terpasang");
    }
    
    public void isiPeluru(int jumlah) {
        s.setPeluru(s.getPeluru() + jumlah);
        System.out.println(">> Peluru berhasil ditambah:" + s.getPeluru());
    }
}
