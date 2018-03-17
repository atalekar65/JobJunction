/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.earnestpro.jobjunction.servlet;

import com.earnestpro.jobjunction.dao.JobSeekerDAO;
import com.earnestpro.jobjunction.daoimpl.JobSeekerDAOImpl;
import com.earnestpro.jobjunction.jobseeker.JobSeeker;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sanjay
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int candidate_id;
            String candidate_name;
            String candidate_gender;
            String candidate_email;
            String qualification;
            String candidate_contact;
            String candidate_dob;
            String candidate_address;
            String candidate_city;
            int zip_code;
            int candidate_experience;
            String candidate_password;
            
            candidate_id=Integer.parseInt(request.getParameter("candidate_id"));
            candidate_name=request.getParameter("candidate_name");
            candidate_gender=request.getParameter("candidate_gender");
            qualification=request.getParameter("qualification");
            candidate_contact=request.getParameter("candidate_contact");
            candidate_dob=request.getParameter("candidate_dob");
            candidate_address=request.getParameter("candidate_address");
            candidate_city=request.getParameter("candidate_city");
            zip_code=Integer.parseInt(request.getParameter("zip_code"));
            candidate_experience=Integer.parseInt(request.getParameter("candidate_experience"));
            candidate_password=request.getParameter("candidate_password");
            JobSeekerDAO jobseekerdao=new JobSeekerDAOImpl();
              int count=jobseekerdao.addjobseeker(new JobSeeker("sanket","FEMALE","sanket@gmail.com","msc","8219138378","17/08/1980","banglore","karnataka","123456",10,"55957"));
              RequestDispatcher rd=null;
        if(count>0)
        {rd=request.getRequestDispatcher("home.html");
        }
        else{
        rd=request.getRequestDispatcher("register.html");
        }
        rd.forward(request, response);
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
