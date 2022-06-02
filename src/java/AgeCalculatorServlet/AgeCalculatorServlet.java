/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgeCalculatorServlet;

import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guest1
 */
public class AgeCalculatorServlet extends HttpServlet {
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;// stop code call!!
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
       String ageOf = request.getParameter("ageOf");
       if (ageOf == null || ageOf.equals("")){
           
           String emessage = "Enter valid number";
           request.setAttribute("emessage", emessage);
           
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
               }
       else {
                    
      int numof = 0;
           try{
           numof = Integer.parseInt(ageOf);
          numof++;
           
           }
                   catch( Exception e){
           String emessage = "Enter number";
           request.setAttribute("emessage", emessage);
           
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
          return;
                           }
           
             request.setAttribute("emessage",("Your age next birthday will be "+ numof));
        
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
           

       }
    }

}
