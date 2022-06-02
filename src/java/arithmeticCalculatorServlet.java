/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guest1
 */
public class arithmeticCalculatorServlet extends HttpServlet {
  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;// stop code call!!
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
       String fVal = request.getParameter("fVal");
       String sVal = request.getParameter("sVal");
       request.setAttribute("fVals", fVal);
       request.setAttribute("sVals", sVal);
       if (fVal == null || fVal.equals("") ||sVal == null || sVal.equals("")){
           
         
           request.setAttribute("result", "Invalid");
           
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
               }
       int f = Integer.parseInt(fVal);
       int s = Integer.parseInt(sVal);
       String act = request.getParameter("act");
       if (act == null) {
//no button has been selected
} else if (act.equals("+")) {
//+ button was pressed
request.setAttribute("result", f + s);
} else if (act.equals("-")) {
//- button was pressed
request.setAttribute("result", f - s);
} else if (act.equals("*")) {
//* button was pressed
request.setAttribute("result", f * s);
} else if (act.equals("%")) {
//% button was pressed
request.setAttribute("result", f % s);
} else {
//someone has altered the HTML and sent a different value!
request.setAttribute("result", "invalid");
}
        
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
       
    }

}