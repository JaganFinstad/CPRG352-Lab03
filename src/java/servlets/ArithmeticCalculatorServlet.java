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
 * @author jagan
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

  

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("dash", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return;
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNumber = request.getParameter("FirstNumber");
        String secondNumber = request.getParameter("SecondNumber");
        request.setAttribute("firstnumber", firstNumber);
        request.setAttribute("secondnumber", secondNumber);
        
        
        if (firstNumber == null || firstNumber.equals("") || secondNumber == null || secondNumber.equals("")) {
            request.setAttribute("dash", "Invalid");
        }
        
        else if (isEmpty(firstNumber, secondNumber)) {
            request.setAttribute("dash", "Invalid");
        }
            
        else {
            String whatOperation = request.getParameter("arithmetic");
            int firstnumber = Integer.parseInt(firstNumber);
            int secondnumber = Integer.parseInt(secondNumber);
            int answer = 0;
            
            switch (whatOperation) {
                case "+": answer = firstnumber + secondnumber;
                          request.setAttribute("dash", answer);
                break;
                 case "-":answer = firstnumber - secondnumber;
                          request.setAttribute("dash", answer);
                break;
                 case "*": answer = firstnumber * secondnumber;
                          request.setAttribute("dash", answer);
                break;
                 case "%": answer = firstnumber % secondnumber;
                          request.setAttribute("dash", answer);
                break;
                
                          
        }
            
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return;
    }

    
        public boolean isEmpty (String FirstNumber, String SecondNumber) {
        boolean isEmpty;
        try {
            double isfirstNumber = Integer.parseInt(FirstNumber);
            double isSecondNumber = Integer.parseInt(SecondNumber);
            isEmpty = false;
            }
            
            catch (NumberFormatException e) {
                isEmpty = true;
            }
        return isEmpty;
    }

}
