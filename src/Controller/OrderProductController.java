/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.OrderProduct;
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
public class OrderProductController {
    public static Connection getConnection() throws SQLException{
        String DB_URL = "jdbc:sqlserver://localhost:1433; databaseName=Examp; user=sa; password= 123456";
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    public static ArrayList<OrderProduct> getListOrder(){
        String sql = "Select * From OrderProduct";
        ResultSet rs = null;
        ArrayList<OrderProduct> list = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                OrderProduct od = new OrderProduct(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(5),rs.getDouble(4),rs.getString(6));
                list.add(od);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static int AddOrder(OrderProduct odProduct){
        String sql = "INSERT INTO OrderProduct VALUES(?, ?, ?, ?, ?)";
        int kq = -1;
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, odProduct.getIdCustomer());
            stmt.setString(2, odProduct.getIdUser());
            stmt.setDouble(3, odProduct.getTotalPrice());
            stmt.setInt(4, odProduct.getSale());
            stmt.setString(5, odProduct.getCreated_at_date());
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static OrderProduct  searchIdOrder (String idOrder){
        ResultSet rs = null;
        OrderProduct odProduct = null;
        String sql = "SELECT * FROM OrderProduct WHERE idOrder= ?;";
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, idOrder);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                odProduct = new OrderProduct(rs.getInt(1), rs.getInt(2), rs.getString(3),rs.getInt(5) ,rs.getDouble(4), rs.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return odProduct;
    }
    
    public static int delete(String idOrder){
        int kq = -1;
        String sql = "DELETE FROM OrderProduct WHERE idOrder= ?;";
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,idOrder);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    public static int update(int idOrder, OrderProduct odProduct){
        String sql = "UPDATE OrderProduct SET idCustomer=?, idUser=? WHERE idOrder= ?; ";
        int kq = -1;
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, odProduct.getIdCustomer());
            stmt.setString(2, odProduct.getIdUser());
            stmt.setInt(kq, idOrder);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static ArrayList<OrderProduct>  searchDate (String date){
        ResultSet rs = null;
        String sql = "SELECT * FROM OrderProduct WHERE created_at_date= ?;";
        ArrayList<OrderProduct> list = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, date);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                OrderProduct od = new OrderProduct(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(5),rs.getDouble(4),rs.getString(6));
                list.add(od);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static int updateTotal(int idOrder, double tien){
        String sql = "UPDATE OrderProduct SET totalPrice=? WHERE idOrder= ?; ";
        int kq = -1;
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setDouble(1, tien);
            stmt.setInt(2, idOrder);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static void main(String[] args) {
        ArrayList<OrderProduct> listOr = OrderProductController.searchDate("2022-01-22");
        System.out.println(listOr.size());
    }
}
