import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Logout extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse res)
            throws ServletException, IOException {

           HttpSession session = request.getSession();
           session.setAttribute("gmail", null);
           session.setAttribute("pass", null);
           res.sendRedirect("/sendmail");
       }
    }   
