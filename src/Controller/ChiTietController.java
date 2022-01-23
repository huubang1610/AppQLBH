/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ChiTiet;
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
public class ChiTietController {
    public static Connection getConnection(){
        String DB_URL = "jdbc:sqlserver://localhost:1433; databaseName=Examp; user=sa; password= 123456";
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ChiTietController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static ArrayList<ChiTiet> getListChiTiet(){
        String sql = "Select * From ChiTiet";
        ResultSet rs = null;
        ArrayList<ChiTiet> list = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                ChiTiet ct = new ChiTiet(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(5),rs.getInt(4),rs.getString(6));
                list.add(ct);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static int AddChiTiet(ArrayList<ChiTiet> list){
        String sql = "INSERT INTO ChiTiet VALUES(?, ?, ?, ?, ?)";
        int kq = -1;
        try {
            for (ChiTiet ct : list) {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ct.getIdProduct());
            stmt.setInt(2, ct.getNumberProduct());
            stmt.setInt(3, ct.getIdOrder());
            stmt.setDouble(4, ct.getMoney());
            stmt.setString(5, ct.getCreated_at_time());
            kq = stmt.executeUpdate();
                if (kq < 1) {
                    return kq;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static ArrayList<ChiTiet>  searchIdOrder (String idOrder){
        ResultSet rs = null;
        String sql = "SELECT * FROM ChiTiet WHERE idOrder= ?;";
        ArrayList<ChiTiet> list = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, idOrder);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                ChiTiet ct = new ChiTiet(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(5),rs.getInt(4),rs.getString(6));
                list.add(ct);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static int update(int idChiTiet, ChiTiet ct){
        String sql = "UPDATE ChiTiet SET idProduct=?, numberProduct=?  WHERE idChiTiet= ?; ";
        int kq = -1;
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ct.getIdProduct());
            stmt.setInt(2, ct.getNumberProduct());
            stmt.setInt(3, idChiTiet);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static int delete(String idOrder){
        int kq = -1;
        String sql = "DELETE FROM ChiTiet WHERE idOrder= ?;";
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,idOrder);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
}
