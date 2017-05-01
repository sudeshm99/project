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

import com.dmr.project.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GetAreas {
    
    DBConnection connection = new DBConnection();
    Connection conn = null;
    ResultSet result = null;
    ArrayList<String> areaList = new ArrayList<String>();
    String area = null;
    
    public ArrayList<String> getAreas(){
       
       try{
        
           conn = connection.connect();
           String sql = "SELECT DISTINCT area_office FROM all_users;";
           PreparedStatement statement = conn.prepareStatement(sql);
           result = statement.executeQuery();
           
           while(result.next()){
              area = result.getString("area_office");
              areaList.add(area);
           }
               
       }catch(Exception ex){
           System.out.println("Exception in get area ex: "+ex);
       }
       return areaList;
    }
}
