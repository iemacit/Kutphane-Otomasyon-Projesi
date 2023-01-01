/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryApp;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_Helper {
    public static String username="root";
    public static String password="root";
    public static String db_URL="jdbc:mysql://localhost:3306/kutuphane";

    public static void DeleteBooks(String kitapAdi)throws SQLException{
        Connection conn = DriverManager.getConnection(db_URL,username,password);
        PreparedStatement ps = conn.prepareStatement("DELETE FROM kitaplar" + " WHERE Kitap_Adi='" + kitapAdi + "'");
        ps.executeUpdate();
    }

    public static void UpdateBooks(String bookName,String bookWriter,String bookContent, String bookId)throws SQLException{
        System.out.println(bookId + bookName);
        Connection conn = DriverManager.getConnection(db_URL,username,password);
        PreparedStatement ps =conn.prepareStatement("UPDATE kitaplar SET Kitap_Adi='" + bookName +
                "' ,Kitap_Yazari='" + bookWriter + "'" + " ,Kitap_Icerigi='" + bookContent + "'" +
                "WHERE Kitap_Adi='" + bookId + "'");
        ps.executeUpdate();
    }
    public static void DeleteUser(String userName) throws SQLException {
        Connection conn = DriverManager.getConnection(db_URL,username,password);
        PreparedStatement ps = conn.prepareStatement("DELETE FROM kullanici" + " WHERE Kullanici_Adi='" + userName + "'");
        ps.executeUpdate();
    }

    public static void UpdateUser(String userName,String userPassword,String userId)throws SQLException{
        Connection conn = DriverManager.getConnection(db_URL,username,password);
        PreparedStatement ps =conn.prepareStatement("UPDATE kullanici SET Kullanici_Sifre='" + userPassword +
                "' ,Kullanici_Adi='" + userName + "'" + "WHERE Kullanici_Adi='" + userId + "'");
        ps.executeUpdate();
    }
    public Connection getConnection() throws SQLException{
        return (Connection) DriverManager.getConnection(db_URL,username,password);
    }

    public void ShowError(SQLException exception){
        System.out.println("ERROR"+exception.getMessage());
        System.out.println(exception.getErrorCode());
    }
    
     public static void dbToTable(DefaultTableModel tblModel) throws SQLException {
        Connection conn = DriverManager.getConnection(db_URL, username, password);
        PreparedStatement ps = conn.prepareStatement("Select * from kitaplar");
        ResultSet rs = ps.executeQuery();
        tblModel.setRowCount(0);
        while (rs.next()) {

            Object o[] = {rs.getString("Kitap_Adi"), rs.getString("Kitap_Yazari"), rs.getString("Kitap_Icerigi")};
            tblModel.addRow(o);

        }

    }
     public static void dbToTableKullanici(DefaultTableModel tblModel) throws SQLException {
        Connection conn = DriverManager.getConnection(db_URL, username, password);
        PreparedStatement ps = conn.prepareStatement("Select * from kullanici");
        ResultSet rs = ps.executeQuery();
        tblModel.setRowCount(0);
        while (rs.next()) {

            Object o[] = {rs.getString("Kullanici_Adi"), rs.getString("Kullanici_Sifre")};
            tblModel.addRow(o);

        }

    }
    
    
    
}
