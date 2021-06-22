import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MailApp extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String user,pass = null;

        try{
            String to = request.getParameter("to");
            String subject = request.getParameter("subject");
            String message =  request.getParameter("message");
            HttpSession session = request.getSession();
            user = (String) session.getAttribute("gmail");
            pass = (String) session.getAttribute("pass");
            if(SendMail.send(to,subject, message, user, pass)){
            response.sendRedirect("success.html");
            }
            else{
                response.sendRedirect("mail_error.html");
            }
  
        }catch(Exception ex){   
            response.sendRedirect("mail_error.html");
        }
        
      
    }   
}
