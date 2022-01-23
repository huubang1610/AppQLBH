/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Supplier;
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
public class SupplierController {
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
    
    public static ArrayList<Supplier> getList(){
        String sql = "SELECT * FROM Supplier;";
        /*String sql = "SELECT idSupplier, nameSupplier,number,Supplier.price,Product.nameProduct,Account.fullname,Supplier.created_at \n" +
                        "FROM ((Supplier\n" +
                        "INNER JOIN Account ON Supplier.idUser = Account.idUser)\n" +
                           "INNER JOIN Product ON Supplier.idProduct = Product.idProduct)";*/
        ResultSet rs = null;
        ArrayList<Supplier> list = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Supplier warehouse = new Supplier(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), 
                        rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(warehouse);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static int AddSupplier(Supplier supplier){
        String sql = "INSERT INTO Supplier VALUES(?, ?, ?, ?, ?, ?)";
        int kq = -1;
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, supplier.getNameSupplier());
            stmt.setString(2, supplier.getNumber());
            stmt.setDouble(3, supplier.getPrice());
            stmt.setString(4, supplier.getIdProduct());
            stmt.setString(5, supplier.getIdUser());
            stmt.setString(6, supplier.getCreated_at());
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static int deleteSupplier(int idSupplier){
        String sql = "DELETE FROM Supplier WHERE idSupplier=?;";
        int kq = -1;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,idSupplier);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    public static Supplier searchSupplier (String idSupplier){
        ResultSet rs = null;
        String sql  = "SELECT * FROM Supplier Where idSupplier=?;";
        Supplier supplier = null;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(01, idSupplier);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                supplier = new Supplier(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), 
                        rs.getString(6), rs.getString(7));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return supplier;
    }
    
    public static int updateSupplier(int idSupplier, Supplier supplier){
        String sql = "UPDATE Supplier SET nameSupplier=?, number= ?, price= ?, idProduct= ?, idUser= ? WHERE idSupplier=?;";
        int kq = -1;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,supplier.getNameSupplier());
            stmt.setString(2,supplier.getNumber());
            stmt.setDouble(3,supplier.getPrice());
            stmt.setString(4,supplier.getIdProduct());
            stmt.setString(5,supplier.getIdUser());
            stmt.setInt(6,idSupplier);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static ArrayList<Supplier> searchNameSupplier (String nameSupplier){
        ResultSet rs = null;
        String sql  = "SELECT * FROM Supplier Where nameSupplier=?;";
        Supplier supplier = null;
        Connection conn = getConnection();
        ArrayList<Supplier> list = new ArrayList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nameSupplier);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Supplier warehouse = new Supplier(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), 
                        rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(warehouse);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static ArrayList<Supplier> searchDate (String date){
        ResultSet rs = null;
        String sql  = "SELECT * FROM Supplier Where created_at=?;";
        Supplier supplier = null;
        Connection conn = getConnection();
        ArrayList<Supplier> list = new ArrayList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, date);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Supplier warehouse = new Supplier(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), 
                        rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(warehouse);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
