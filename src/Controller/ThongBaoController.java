/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ThongBao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell G3
 */
public class ThongBaoController {
    public static Connection getConnection(){
        String DB_URL = "jdbc:sqlserver://localhost:1433; databaseName=Examp; user=sa; password= 123456";
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static ArrayList<ThongBao> getList(){
        String sql = "SELECT * FROM ThongBao;";
        ResultSet rs = null;
        ArrayList<ThongBao> list = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {     
                ThongBao tb = new ThongBao(rs.getString(1),rs.getInt(2));
                list.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongBaoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static int updateThongBao(int id, String noidung){
        String sql = "UPDATE ThongBao SET tb=? WHERE id=?;";
        int kq = -1;
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, noidung);
            stmt.setInt(2, id);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ThongBaoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
}
