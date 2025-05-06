import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        // Create objects of Manager and Programmer
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Manager pegawai3 = new Manager("Argo");

        // Create an ArrayList to store Pegawai objects
        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        // Loop through the ArrayList and call tampilData() method
        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}
