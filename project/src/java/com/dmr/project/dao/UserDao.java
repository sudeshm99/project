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
import com.dmr.project.model.User;
import com.dmr.project.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    
    public static boolean getLogUserValidate(User loggingUser){
        
        String username = loggingUser.getUsername();
        String password = loggingUser.getPassowrd();
        boolean isValid = false;
        Connection connection = null;
        //Connection connection = null;
        System.out.printf("in UserDao--username:%s and passowrd: %s\n",username,password);
        
        try
        {
            connection = DBConnection.connect();
            String query = "SELECT username,password FROM logging_table WHERE username = ? AND password = ?";
                            
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
//            System.out.println(connection.isClosed());

            ResultSet resultSet = statement.executeQuery();
            resultSet.first();
            
//            Determine whether result set has results
            if(username.equals(resultSet.getString("username"))){
                isValid = true;
            }
//            resultSet close
            resultSet.close();
//            Database Connection close
            connection.close();
            
            
            
            
           
        }
        catch(SQLException ex)
        {
            System.out.println("UserDao logging exception :"+ex);
        } 
        
        System.out.println("Here :"+isValid);
        return isValid;
    }
    
    
}
