/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmr.project.dao;

/**
 *
 * @author chamara
 */
import com.dmr.project.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTest {
    
    public static boolean addData(String username,String password){
        
        try
        {
            Connection con = DBConnection.connect();
            String query = "INSERT INTO test(username,password) VALUES(?,?)";
            PreparedStatement statement =  con.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2,password);
            statement.execute();
        }
        catch(SQLException ex){
            
            System.out.println(ex);
            return false;
        }
        
        return true;
      
    }
}
