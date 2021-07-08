/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv.generator;

import java.sql.*;
import javax.swing.*;
public class db {
    
        
    Connection conn=null;
    public static Connection java_db(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:F:\\Nirma\\sem 2\\AJT\\Project\\database\\cv_database.sqlite");
            JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
