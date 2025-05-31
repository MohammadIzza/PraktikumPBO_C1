// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 28 Mei 2025
// File         : Program.java
// Deskripsi    : Implementasi Program

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        // insert
        System.out.println("===insert===");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Khoirul");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        service.displayAll();

        // update
        System.out.println("===update===");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Nasid");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        service.displayAll();

        // delete
        System.out.println("===delete===");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        service.displayAll();
    }
}

