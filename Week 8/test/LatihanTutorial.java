/**
 *
 * @author Mohammad Izza Hakiki
 */
public class LatihanTutorial {

    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR!");
        
        System.out.println("Jumlah peluru: " + ak47.getPeluru());
        System.out.println("Isi peluru: "); ak47.setPeluru(5);
        System.out.println("Juml peluru: " + ak47.getPeluru()) ;
        System.out.println("AK47 menembak: "); ak47.menembak();    
    }
}
