/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import entity.User;
import service.RegisterService;
 
 
public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
     String firstName = request.getParameter("firstName");
     System.out.println(firstName);
     String middleName = request.getParameter("middleName");
     String lastName = request.getParameter("lastName");
     String email = request.getParameter("email");
     String passwordHint = request.getParameter("passwordHint");
     String password = request.getParameter("password");
     String passwordCheck = request.getParameter("passwordCheck");
     
     User user = new User(email,firstName,password, passwordHint, lastName, middleName);
     try {  
         RegisterService registerService = new RegisterService();
         boolean result = registerService.register(user);       
         out.println("<html>");
         out.println("<head>");       
         out.println("<title>Регистрация прошла успешно!</title>");     
         out.println("</head>");
         out.println("<body>");
         out.println("<center>");
         if(result){
             out.println("<h1>Спасибо за регистрацию:</h1>");
             out.println("Для входа в систему при помощи Вашего email и пароля <a href=login.jsp>пройдите по данной ссылке!</a>");
         }else{
             out.println("<h1>Регистрация завершилась ошибкой!</h1>");
             out.println("Пожалуйста попробуйте еще раз пройдя по <a href=registration.jsp>данной ссылке!</a>");
         }
         out.println("</center>");
         out.println("</body>");
         out.println("</html>");
     } finally {        
         out.close();
     }
}
}
