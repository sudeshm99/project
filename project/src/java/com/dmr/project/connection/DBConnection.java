/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmr.project.connection;

/**
 *
 * @author chamara
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {
    public static java.sql.Connection connect()  {
//        initializing Connection variable.
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException ex) {
            System.out.println("DBConnection class :"+ex);
        }
         
       
        
//        Connection parameters
        String url = "jdbc:mysql://localhost:3306/digitalMeter";
        String username = "root";
        String password = "1234";
            
        try {
            //            Establishing connection
            con = DriverManager.getConnection(url,username,password);
        } 
        catch (SQLException ex) {
            System.out.println("SQL Exception : "+ ex);
        }
        
//        Test whether connection is established or not
        if(con != null){
            System.out.println("****CONNECT TO THE DATABASE*****");
        }
        else{
            System.out.println("####NOT CONNECT TO THE DATABASE");
        }
        return con;
            
            
       
        
        
    }
}
