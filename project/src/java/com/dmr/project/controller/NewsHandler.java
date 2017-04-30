/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmr.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dmr.project.dao.SendSMS;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.dmr.project.service.SendsmsService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class NewsHandler extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       SendsmsService sendsms = new SendsmsService();
       String area = request.getParameter("area");
       String transeformer = request.getParameter("transeformer");
       String message = request.getParameter("message");
       
       SendSMS send = new SendSMS();
       ArrayList<Integer> numbers = send.getNumbers(area,transeformer);
      
       
       response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            int count = 0;
             for(int i=0; i<numbers.size();i++){
                int temp = numbers.get(i);
                String num = "94"+Integer.toString(temp);
                sendsms.sendSms(message, num);
                count++;
                }
             if(count==0){
                 JOptionPane.showMessageDialog(null, "not sended");
                 response.setContentType("text/html;charset=UTF-8");
                 RequestDispatcher rd = request.getRequestDispatcher("/sendNews.jsp");
                 rd.include(request, response);
                 
             }else{
                 JOptionPane.showMessageDialog(null, "Message send successfuly");
                 response.setContentType("text/html;charset=UTF-8");
                 RequestDispatcher rd = request.getRequestDispatcher("/sendNews.jsp");
                 rd.include(request, response);
            }
            
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
