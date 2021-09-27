
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
public class AgeCalculatorServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        
        
        
       
        if (age == null || age.equals("")) {
            
            request.setAttribute("message", "You must give your current age <br>");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
            
        }
        else {
            try {
            int usableAge = Integer.parseInt(age) + 1;
            String goodMessage = "Your age next birthday will be " + usableAge + "<br>" ;
            request.setAttribute("message", goodMessage);
            }
            
            catch (NumberFormatException l) {
                request.setAttribute("message", "You must enter a number <br>");
            }
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            return;
        }
        
    }

}
