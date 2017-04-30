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
import com.dmr.project.model.User;

public class RequestFormDao {
    
    public static boolean requestFormAddData(User user){
        
        try
        {
           Connection con = DBConnection.connect();
           
           String query = "INSERT INTO user(first_name,last_name,address,national_id,email,"
                   + "mobile_number,ceb_account,area_office,request_dateTime) VALUES(?,?,?,?,?,?,?,?,?)";
           
           PreparedStatement statement = con.prepareStatement(query);
           statement.setString(1,user.getFirstname());
           statement.setString(2,user.getLastname());
           statement.setString(3,user.getAddress());
           statement.setString(4,user.getNationalId());
           statement.setString(5,user.getEmail());
           statement.setInt(6,user.getMobileNo());
           statement.setInt(7,user.getCebAccountNo());
           statement.setString(8,user.getAreaOffice());
           statement.setString(9,user.getRequestDate());
           boolean isExecuted = statement.execute();
            System.out.println("request form boolean : "+isExecuted);
        }
        catch(Exception ex)
        {
            System.out.println("Exception form RequestFormDao");
            return false;
        }
        
        return true;
    }
}
