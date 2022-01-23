/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Category;
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
public class CategoryControlller {
    public static Connection getConnection(){
        String DB_URL = "jdbc:sqlserver://localhost:1433; databaseName=Examp; user=sa; password= 123456";
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CategoryControlller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static ArrayList<Category> getList(){
        String sql = "Select * From Category;";
        ResultSet rs = null;
        ArrayList<Category> list = new ArrayList<>();
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Category category = new Category(rs.getString(1),rs.getString(2),rs.getString(3));
                list.add(category);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryControlller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static int AddCategory(Category category){
        String sql = "INSERT INTO Category VALUES(?, ?, ?)";
        int kq = -1;
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, category.getIdCategory());
            stmt.setString(2, category.getFullnameCategory());
            stmt.setString(3, "");
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryControlller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static int delete(String idCategory){
        int kq = -1;
        String sql = "DELETE FROM Category WHERE idCategory=?;";
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,idCategory);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryControlller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static int update(String id, String name){
        String sql = "UPDATE Category SET fullnameCatagory=? WHERE idCategory=?; ";
        int kq = -1;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, id);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryControlller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static ArrayList<String> getIDCategory(){
        String sql = "Select idCategory From Category;";
        ResultSet rs = null;
        ArrayList<String> list = new ArrayList<>();
        Connection conn = getConnection();
        try {
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
    

}
