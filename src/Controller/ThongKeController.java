/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ThongKe;
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
public class ThongKeController {
    
    public static Connection getConnection(){
        String DB_URL = "jdbc:sqlserver://localhost:1433; databaseName=Examp; user=sa; password= 123456";
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public ArrayList<ThongKe> getList(){
        String sql = "SELECT * FROM ThongKe;";
        ResultSet rs = null;
        ArrayList<ThongKe> list = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                ThongKe tk = new ThongKe(rs.getInt(1), rs.getDouble(2), rs.getString(3));
                list.add(tk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
   
    
}
