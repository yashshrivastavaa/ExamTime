/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author shriv
 */
public class ConnectionProvider {
    Connection con = null;
    java.sql.PreparedStatement pst;
    public static Connection getCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","809885");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
