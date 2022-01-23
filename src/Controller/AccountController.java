/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Account;
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
public class AccountController {
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
    
    public static ArrayList<Account> getList(){
        String sql = "SELECT * FROM Account;";
        ResultSet rs = null;
        ArrayList<Account> list = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Account account = new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                        rs.getString(5), rs.getInt(6), rs.getString(7), rs.getBytes(8), 
                        rs.getString(9), rs.getString(10), rs.getString(11),rs.getString(12));
                list.add(account);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static ArrayList<String> getListId(){
        String sql = "SELECT idUser FROM Account;";
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
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static Account getLogin(String userName){
        String sql = "SELECT * FROM Account Where username= ?;";
        ResultSet rs = null;
        Account account = null;
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, userName);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                account = new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                        rs.getString(5), rs.getInt(6), rs.getString(7), rs.getBytes(8), 
                        rs.getString(9), rs.getString(10), rs.getString(11),rs.getString(12));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return account;
    }
    
    public static int AddAccount(Account account){
        String sql = "INSERT INTO Account VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int kq = -1;
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, account.getIdUser());
            stmt.setString(2, account.getUserName());
            stmt.setString(3, account.getPassWord());
            stmt.setString(4, account.getFullName());
            stmt.setString(5, account.getPosition());
            stmt.setInt(6, account.getAge());
            stmt.setString(7, account.getEmail());
            stmt.setBytes(8, account.getAvatar());
            stmt.setString(9, account.getCccd());
            stmt.setString(10, account.getAddress());
            stmt.setString(11, account.getDate());
            stmt.setString(12, account.getSex());
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static Account  search (String idUser){
        ResultSet rs = null;
        Account account = null;
        String sql = "SELECT * FROM Account WHERE idUser= ?;";
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, idUser);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                account = new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                        rs.getString(5), rs.getInt(6), rs.getString(7), rs.getBytes(8), 
                        rs.getString(9), rs.getString(10), rs.getString(11),rs.getString(12));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return account;
    }
    
    public static int delete(String idUser){
        int kq = -1;
        String sql = "DELETE FROM Account WHERE idUser=?;";
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,idUser);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static int update(String idUserNameBefore, Account account){
        String sql = "UPDATE Account SET idUser=?, username=?, pass=?, fullname=?, position=?, age=?, email=?, avatar=?, cccd=?, diachi=?, Sex=? WHERE idUser=?; ";
        int kq = -1;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, account.getIdUser());
            stmt.setString(2, account.getUserName());
            stmt.setString(3, account.getPassWord());
            stmt.setString(4, account.getFullName());
            stmt.setString(5, account.getPosition());
            stmt.setInt(6, account.getAge());
            stmt.setString(7, account.getEmail());
            stmt.setBytes(8, account.getAvatar());
            stmt.setString(9, account.getCccd());
            stmt.setString(10, account.getAddress());
            stmt.setString(11, account.getSex());
            stmt.setString(12, idUserNameBefore);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static int updateNV(String id, Account account){
        String sql = "UPDATE Account SET username=?, pass=?, fullname=?, email=?,avatar=? ,diachi=? WHERE idUser=?; ";
        int kq = -1;
        Connection conn = getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, account.getUserName());
            stmt.setString(2, account.getPassWord());
            stmt.setString(3, account.getFullName());
            stmt.setString(4, account.getEmail());
            stmt.setBytes(5, account.getAvatar());
            stmt.setString(6, account.getAddress());
            stmt.setString(7, id);
            kq = stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public static ArrayList<Account> getListCV(String position){
        String sql = "SELECT * FROM Account Where position= ?;";
        ResultSet rs = null;
        ArrayList<Account> list = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, position);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Account account = new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                        rs.getString(5), rs.getInt(6), rs.getString(7), rs.getBytes(8), 
                        rs.getString(9), rs.getString(10), rs.getString(11),rs.getString(12));
                list.add(account);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static void main(String[] args) {
        ArrayList<Account> list = getList();
        for (Account account : list) {
            System.out.println(account.toString());
        }
    }
}
