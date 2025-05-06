
public class ContohMetodeGenerik {
    public static void main (String[] args){
        Datum<Anabul> AnabulG = new Datum<>();
        Anabul a = new Anjing("Susan");
        Anabul b = new Kucing("Tommy");
        Anabul c = new Burung("Lanjiao");
        AnabulG.setIsi(a);
        System.out.println(AnabulG.getIsi().gerak());    
        System.out.println(AnabulG.getIsi().bersuara());  
        System.out.println("==============pembeda============="); 
        AnabulG.getIsi().printInfo();
        System.out.println("===================================");  
        AnabulG.setIsi(b);
        System.out.println(AnabulG.getIsi().gerak());    
        System.out.println(AnabulG.getIsi().bersuara());    
        System.out.println("==============pembeda============="); 
        AnabulG.getIsi().printInfo();
        System.out.println("===================================");  
        AnabulG.setIsi(c);
        System.out.println(AnabulG.getIsi().gerak());    
        System.out.println(AnabulG.getIsi().bersuara());    
        System.out.println("==============pembeda============="); 
        AnabulG.getIsi().printInfo();
        
    }
}
