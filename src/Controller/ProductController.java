/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
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
public class ProductController {
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
    
    public static ArrayList<Product> getList(){
        String sql = "Select idProduct,nameProduct,descriptionProduct,avatar,size,fullnameCatagory,statusProduct,price,created_at "
                + "From Product JOIN Category ON Product.idCategory = Category.idCategory;";
        ResultSet rs = null;
        ArrayList<Product> list = new ArrayList<>();
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Product p = new Product(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBytes(4), rs.getString(5), 
                        rs.getString(6), rs.getString(7), rs.getDouble(8),rs.getString(9));
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static ArrayList<String> getListId(){
        String sql = "SELECT idProduct FROM Product;";
        ResultSet rs = null;
        ArrayList<String> list = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                list.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static int AddProduct(Product product){
        String sql = "INSERT INTO Product VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int kq = -1;
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, product.getIdProduct());
            stmt.setString(2, product.getNameProduct());
            stmt.setString(3, product.getDescriptionProduct());
            stmt.setBytes(4, product.getAvatar());
            stmt.setString(5, product.getSize());
            stmt.setString(6, product.getIdCategory());
            stmt.setString(7, product.getStatusProduct());
            stmt.setDouble(8, product.getPriceProduct());
            stmt.setString(9, product.getCreated_at());
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static int deleteProduct(String idProduct){
        String sql = "DELETE FROM Product WHERE idProduct=?;";
        int kq = -1;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,idProduct);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    public static Product searchProduct (String idProduct){
        ResultSet rs = null;
        String sql  = "SELECT * FROM Product Where idProduct = ?;";
        Product product = null;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(01, idProduct);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                product = new Product(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBytes(4), rs.getString(5), 
                        rs.getString(6), rs.getString(7), rs.getDouble(8),rs.getString(9));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }
    
    public static ArrayList<Product> searchProduct_Ma (String idCategory){
        ResultSet rs = null;
        String sql  = "SELECT * FROM Product Where idCategory = ?;";
        ArrayList<Product> list = new ArrayList<>();
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, idCategory);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Product product = new Product(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBytes(4), rs.getString(5), 
                        rs.getString(6), rs.getString(7), rs.getDouble(8),rs.getString(9));
                list.add(product);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static int updateProduct(String idProduct, String name, String descriptionProduct, String status, Double price, byte[] avatar){
        String sql = "UPDATE Product SET nameProduct=?, descriptionProduct= ?, statusProduct= ?, price= ?, avatar= ? WHERE idProduct=?;";
        int kq = -1;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,name);
            stmt.setString(2,descriptionProduct);
            stmt.setString(3,status);
            stmt.setDouble(4,price);
            stmt.setBytes(5,avatar);
            stmt.setString(6,idProduct);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
}
