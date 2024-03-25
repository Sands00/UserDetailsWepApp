/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import za.ac.tut.business.person;
import za.ac.tut.business.personProcessor;

/**
 *
 * @author Sandiso
 */
public class AddUserDetailsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        
        person p = new person(name,gender,dob);
        personProcessor pp = new personProcessor(p);
        String title = pp.determineTitle();
        String age = pp.determineAge();
        
        request.setAttribute("name", name);
        request.setAttribute("age", age);
        request.setAttribute("title", title);
        
        RequestDispatcher disp= request.getRequestDispatcher("addUserDetailsOutcome.jsp");
        disp.forward(request, response);
        
        }
    }

    


