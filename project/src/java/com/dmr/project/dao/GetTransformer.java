/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmr.project.dao;

/**
 *
 * @author root
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.dmr.project.connection.DBConnection;

public class GetTransformer {
    ResultSet result = null;
    DBConnection connection = new DBConnection();
    
    public ResultSet getData(String area){
        try{
            Connection conn = connection.connect();
            String sql = "SELECT DISTINCT transformer_id FROM all_users WHERE area_office=?;";
            PreparedStatement statement =conn.prepareStatement(sql);
            statement.setString(1, area);
          result =  statement.executeQuery();
        }catch(Exception ex){
            System.out.println("quert exception : "+ex);
        }
        return result;  
    }
}
