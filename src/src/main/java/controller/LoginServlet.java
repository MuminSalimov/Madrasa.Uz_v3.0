/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import entity.User;
import service.LoginService;
 
 
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
     String email = request.getParameter("email");    
     String password = request.getParameter("password");
     LoginService loginService = new LoginService();
     boolean result = loginService.authenticateUser(email, password);
     User user = loginService.getUserByEmail(email);
     if(result == true){
         request.getSession().setAttribute("user", user);

         //there was getServletContext().getContextPath

         response.sendRedirect(request.getContextPath() +"/userCabinet/main.jsp");
     }
     else{
         response.sendRedirect("error.jsp");
     }
}
 
}
