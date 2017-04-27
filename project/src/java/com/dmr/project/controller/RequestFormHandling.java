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
import com.dmr.project.service.GetLocalTimeDate;
import com.dmr.project.model.User;
import com.dmr.project.dao.RequestFormDao;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author chamara
 */
public class RequestFormHandling extends HttpServlet {

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
        
//        Request form data extracting
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String address = request.getParameter("address");
        String nationalId = request.getParameter("nationalId");
        String email = request.getParameter("email");
        int mobileNumber = Integer.parseInt(request.getParameter("mobilenumber"));
        int cebAccount = Integer.parseInt(request.getParameter("electricityAccount"));
        String areaOffice = request.getParameter("areaOffice");
        String requestDate = GetLocalTimeDate.GetTimeDate();
        
//        Data binding into User object
        User user = new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAddress(address);
        user.setNationalId(nationalId);
        user.setEmail(email);
        user.setMobileNo(mobileNumber);
        user.setCebAccountNo(cebAccount);
        user.setAreaOffice(areaOffice);
        user.setRequestDate(requestDate);
        
//        Store request form's data in database
        boolean flag = RequestFormDao.requestFormAddData(user);
        request.setAttribute("flag_requestForm", flag);
        
        RequestDispatcher rd = null;
        
//        If it is successful user direct to the homepage
        if(flag == true)
        {
            rd = request.getRequestDispatcher("/index.jsp");
            String requestFormMsg = "Thank you. We process your request.Please keep in touch";
            request.setAttribute("reguestFormMsg",requestFormMsg);
            rd.forward(request, response);
        }
//        If it is failed, user is stayed requesting form page
        else
        {
            rd = request.getRequestDispatcher("/sign_in.jsp");
            rd.include(request, response);
        }
        

    
        
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
        processRequest(request, response);
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
