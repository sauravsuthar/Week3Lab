/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 808735
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");

        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        try
        {

            int a = Integer.parseInt(first);
            int b= Integer.parseInt(second);
            int output = 0;

            if (request.getParameter("+") != null)
            {
                output = a + b;
                request.setAttribute("message", output);
            } else if (request.getParameter("-") != null)
            {
                output = a - b;
                request.setAttribute("message", output);

            } else if (request.getParameter("*") != null)
            {
                output = a * b;
                request.setAttribute("message", output);

            } else if (request.getParameter("%") != null)
            {
                output = a % b;
                request.setAttribute("message", output);

            } else
            {
                request.setAttribute("message", "--");
            }

        } catch (Exception e)
        {
            request.setAttribute("message", "Invalid input please try again");
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
        
    }

 

}
