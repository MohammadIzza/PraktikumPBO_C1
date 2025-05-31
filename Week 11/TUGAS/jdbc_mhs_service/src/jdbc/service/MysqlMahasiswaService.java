// Pembuat      : Khoirul Nasid Furqon - 24060123120042
// Tanggal      : 28 Mei 2025
// File         : MysqlMahasiswaService.java
// Deskripsi    : Implementasi Service

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MysqlMahasiswaService {
    private Connection koneksi;

    /**
     * Constructor - inisialisasi koneksi database
     */
    public MysqlMahasiswaService() {
        this.koneksi = MysqlUtility.getConnection();
    }
    
    // Membuat objek mahasiswa
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }

    // Menambahkan data mahasiswa
    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("berhasil menambah data");
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("gagal menambah data: " + e.getMessage());
        }
    }

    // Update data mahasiswa
    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Berhasil update data");
            } else {
                System.out.println("Data mahasiswa dengan ID " + mhs.getId() + " tidak ditemukan");
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("gagal update data: " + e.getMessage());
        }
    }

    // Delete data mahasiswa sesuai id
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Berhasil hapus data");
            } else {
                System.out.println("Data mahasiswa dengan ID " + id + " tidak ditemukan");
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("gagal hapus data: " + e.getMessage());
        }
    }

    // Ambil mahasiswa sesuai ID
    public Mahasiswa getById(int id) {
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                rs.close();
                ps.close();
                return mhs;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("gagal mengambil data: " + e.getMessage());
        }
        return null;
    }

    // Ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                listMahasiswa.add(mhs);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("gagal mengambil semua data Mahasiswa: " + e.getMessage());
        }
        return listMahasiswa;
    }

    // menampilkan semua data mahasiswa
    public void displayAll() {
        List<Mahasiswa> listMahasiswa = getAll();
        if (listMahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa");
        } else {
            System.out.println("=== DAFTAR MAHASISWA ===");
            for (Mahasiswa mhs : listMahasiswa) {
                System.out.println(mhs.toString());
            }
        }
    }

}