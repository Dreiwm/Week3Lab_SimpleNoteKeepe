/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chris
 */
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("ageCalc") != null){
            String age = request.getParameter("age");
            request.setAttribute("age",age);
                if(age == null || age.equals("")){
                request.setAttribute("result", "Invalid entry, please fill in a valid number");
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
                return;
            }
            else{
                int nextAge = Integer.parseInt(age);
                nextAge = nextAge+1;
                request.setAttribute("result", nextAge);
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
                return; 
            }
         
        }
      
    }

}
