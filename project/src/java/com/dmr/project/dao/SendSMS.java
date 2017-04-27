
package com.dmr.project.dao;

import com.dmr.project.connection.DBConnection;
import com.dmr.project.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class SendSMS {
   
    DBConnection connection = new DBConnection();
    Connection conn = null;
    
    public ArrayList<Integer> getNumbers(String area, String transformer){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String area_office = area;
        String transformer_id = transformer;
        ResultSet result = null;
        int number = 0;
        if(transformer.isEmpty()){
            try{
                conn = connection.connect();
                String sql = "SELECT phone_no FROM all_users WHERE area_office=?;";
                 PreparedStatement statement = conn.prepareStatement(sql);
                 statement.setString(1, area_office);
                 result = statement.executeQuery();
                 while(result.next()){
                      number = result.getInt("phone_no");
                      numbers.add(number);
                 }
                
            }catch(Exception ex){
                System.out.println("get number exception on area"+ex);
            }
        }else{
            try{
                int transformerID = Integer.parseInt(transformer_id);
                conn = connection.connect();
                String sql = "SELECT phone_no FROM all_users WHERE transformer_id=?;";
                 PreparedStatement statement = conn.prepareStatement(sql);
                 statement.setInt(1, transformerID);
                 result = statement.executeQuery();
                 while(result.next()){
                      number = result.getInt("phone_no");
                      numbers.add(number);
                 }
            
            }catch(Exception ex){
                System.out.println("get number exception on transformer"+ex);
            }
        }
        return numbers;
    }
    
}
