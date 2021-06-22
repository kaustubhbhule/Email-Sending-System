import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse res)
            throws ServletException, IOException {
                PrintWriter out = res.getWriter();
           HttpSession session = request.getSession();
           String gmail = request.getParameter("gmail");
           String pass = request.getParameter("pass");
           session.setAttribute("gmail", gmail);
           session.setAttribute("pass", pass);
           res.sendRedirect("sendmail.jsp");
    }   
}
