/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmr.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dmr.project.model.User;
import com.dmr.project.dao.UserDao;
import com.dmr.project.dao.DBTest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author chamara
 */
public class LoginHandler extends HttpServlet {

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
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("Username : "+username+" password : "+ password);
        
//        Creating user object for user who is intending to login
        User loggingUser = new User();
        loggingUser.setPassword(password);
        loggingUser.setUsername(username);
        
//        Check whether input creditionals are valid or not
        boolean isValid = UserDao.getLogUserValidate(loggingUser);
        System.out.println("Here :"+isValid);
        if(isValid)
        {
            
            if(loggingUser.getUsername().equals("admin")){
                HttpSession session = request.getSession();
                session.setAttribute("loggedUsername", loggingUser.getUsername());
                response.sendRedirect("AdminHomePage");
            }
            else{
                HttpSession session = request.getSession();
                session.setAttribute("loggedUsername",loggingUser.getUsername());
                response.sendRedirect("HomeServlet");
            }

        }
        else
        {
            request.setAttribute("failmsg", "Username or password incorrect! Please try again");
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        }
        
        
        
//       RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
//       rd.include(request, response);
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
