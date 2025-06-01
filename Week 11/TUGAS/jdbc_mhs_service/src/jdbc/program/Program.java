// Pembuat      :Mohammad Izza Hakiki - 24060123140139
// Tanggal      : 28 Mei 2025
// File         : Program.java
// Deskripsi    : Implementasi Program

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import jdbc.utilities.MysqlUtility;

/**
 *
 * @author Izza
 */
public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        // insert
        System.out.println("===insert===");
        Mahasiswa mhsAdd = new Mahasiswa();
        mhsAdd.setNama("Mohammad Izza Hakiki");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        service.displayAll();

        // update
        System.out.println("===update===");
        Mahasiswa mhsUpdate = service.getById(mhsAdd.getId());
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Kiki");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        service.displayAll();

        // delete
        System.out.println("===delete===");
        System.out.println("akan di delete: " + service.getById(mhsAdd.getId()));
        service.delete(mhsAdd.getId());
        service.displayAll();

        MysqlUtility.closeConnection(); // Tutup koneksi
    }
}

