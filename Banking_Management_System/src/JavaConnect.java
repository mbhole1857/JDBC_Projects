/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUKUND
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnect {
    Connection conn=null;
    
    public static Connection ConnecrDb()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\MUKUND\\Documents\\NetBeansProjects\\Banking_Management_System\\Bank_Man.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        return null;
    }
}
