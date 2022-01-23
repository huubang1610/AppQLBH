/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Model.sale;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell G3
 */
public class CustomerController {
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
    public static ArrayList<Customer> getList(){
        String sql = "SELECT * FROM Customer;";
        ResultSet rs = null;
        ArrayList<Customer> list = new ArrayList<>();
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Customer customer = new Customer(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getDouble(6) ,rs.getString(5));
                list.add(customer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static int addCustomer (String FullName, String sdt, String type){
        String date = String.valueOf(LocalDate.now());
        String sql = "INSERT INTO Customer VALUES(?, ?, ?, ?, ?)";
        int kq = -1;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,FullName);
            stmt.setString(2,type);
            stmt.setString(3,sdt);
            stmt.setString(4,date);
            stmt.setDouble(5, 0.0);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static Customer searchCustomer (String phone){
        ResultSet rs = null;
        Customer customer = null;
        String sql = "SELECT * FROM Customer Where phone_number = ?;";
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(01, phone);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                customer = new Customer(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getDouble(6) ,rs.getString(5));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customer;
    }
    
    public static int deleteCustomer(String idCustomer){
        String sql = "DELETE FROM Customer WHERE idCustomer=?;";
        int kq = -1;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,idCustomer);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static int updateCustomer(String idCustomer, String name, String phone){
        String sql = "UPDATE Customer SET fullname=?, phone_number=? WHERE idCustomer=?;";
        int kq = -1;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(3,idCustomer);
            stmt.setString(1,name);
            stmt.setString(2,phone);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static ArrayList<Customer> searchCustomer_type(String type){
        String sql = "SELECT * FROM Customer Where customerType= ?;";
        ResultSet rs = null;
        ArrayList<Customer> list = new ArrayList<>();
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, type);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Customer customer = new Customer(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getDouble(6) ,rs.getString(5));
                list.add(customer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static int updateCustomer_Money(String phoneString, double Money, String typeCustomer){
        String sql = "UPDATE Customer SET ChiTieu=?, customerType=? WHERE phone_number=?;";
        int kq = -1;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(3,phoneString);
            stmt.setDouble(1,Money);
            stmt.setString(2,typeCustomer);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    public static ArrayList<sale> getList_sale(){
        String sql = "SELECT * FROM rank_customer;";
        ResultSet rs = null;
        ArrayList<sale> list = new ArrayList<>();
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                sale sale = new sale(rs.getString(1),rs.getInt(2));
                list.add(sale);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static int update_sale(String name_rank, int sale){
        String sql = "UPDATE rank_customer SET sale=? WHERE Ten_Rank=?;";
        int kq = -1;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(2,name_rank);
            stmt.setInt(1,sale);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
}
