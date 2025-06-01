// Pembuat      : Mohammad Izza Hakiki - 24060123140139
// Tanggal      : 28 Mei 2025
// File         : MysqlUtility.java
// Deskripsi    : Implementasi Utility

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;
import java.sql.*;
/**
 *
 * @author Izza
 */
public class MysqlUtility {

    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                System.out.println("\n=== Mencoba membuat koneksi database ===");
                System.out.println("Loading JDBC driver...");
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("JDBC driver berhasil dimuat");
                
                // Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3306/pbo?useSSL=false&serverTimezone=UTC";
                // sesuaikan username dan password
                String user = "root";
                String password = "";
                System.out.println("Mencoba koneksi ke database dengan URL: " + url);
                System.out.println("Username: " + user);
                
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil ke database: " + koneksi.getCatalog());
                    System.out.println("Auto-commit status: " + koneksi.getAutoCommit());
                }
                System.out.println("=== Koneksi database selesai ===\n");
            } catch (ClassNotFoundException cne) {
                System.out.println("\n=== Error loading JDBC driver ===");
                System.out.println("Gagal load driver : " + cne.getMessage());
                cne.printStackTrace();
                System.out.println("=== End of error ===\n");
            } catch (SQLException sqle) {
                System.out.println("\n=== Error koneksi database ===");
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
                sqle.printStackTrace();
                System.out.println("=== End of error ===\n");
            }
        } else {
            System.out.println("Menggunakan koneksi yang sudah ada");
        }
        return koneksi;
    }

    public static void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                System.out.println("Koneksi database ditutup");
            } catch (SQLException e) {
                System.out.println("Gagal menutup koneksi: " + e.getMessage());
            }
        }
    }
}
