/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmr.project.service;

/**
 *
 * @author chamara
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class GetLocalTimeDate {
     public static String GetTimeDate(){

        TimeZone timezone = TimeZone.getTimeZone("Asia/Colombo");
        Calendar calender = Calendar.getInstance(timezone);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setCalendar(calender);
        dateFormat.setTimeZone(timezone);
        String requestDateTime =  dateFormat.format(calender.getTime());
        System.out.println("Request TimeDate : "+requestDateTime);
        return requestDateTime;
        
    }
}
