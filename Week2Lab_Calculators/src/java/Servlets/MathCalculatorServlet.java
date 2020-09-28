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
public class MathCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("firstNumber") != null || request.getParameter("secondNumber") != null){
            String firstNum = request.getParameter("firstNumber");
            String secondNum = request.getParameter("secondNumber");
            
            request.setAttribute("firstNumber",firstNum);
            request.setAttribute("secondNumber",secondNum);
            
            double firstDouble = Double.parseDouble(firstNum);
            double secondDouble = Double.parseDouble(secondNum);
            
            double result = 0;
            if(firstNum == null || firstNum.equals("")|| secondNum == null || secondNum.equals("")){
                request.setAttribute("result", "Invalid entry, please fill in a valid number for both numbers");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
                return;
            }
            else{
                
                if(request.getParameter("+") != null){
                    result = firstDouble + secondDouble;
                }
                else if(request.getParameter("-") != null){
                    result = firstDouble - secondDouble;
                }
                else if(request.getParameter("*") != null){
                    result = firstDouble * secondDouble;
                }
                else if(request.getParameter("%") != null){
                    result = firstDouble / secondDouble;
                    result = result + (firstDouble % secondDouble)/100;
                }
                request.setAttribute("result", result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
                return;
            }
        }  
    }
}