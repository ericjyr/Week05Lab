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
import javax.servlet.http.HttpSession;

/**
 *
 * @author ericr
 */
public class LoginServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //code to destroy session needed use parameter "logout" from home http req
        //also need you have successfully logged out if ^^^^
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp" )
            .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if (username == null || username.equals("") || password == null
                || password.equals("")) {
            request.setAttribute("username", username);
            request.setAttribute("password", password);
            request.setAttribute("message", 
                    "Sorry, invalid username and/or password");
            
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp" )
                .forward(request, response);
        
        } 
        else {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            getServletContext().getRequestDispatcher("/WEB-INF/home.jsp" )
                .forward(request, response);
        }
                 
        
        //process submission of form
        //validate not empty user pass
        
    }

}
