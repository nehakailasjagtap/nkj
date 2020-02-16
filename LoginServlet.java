
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException  
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        String st1=req.getParameter("username");
        String st2=req.getParameter("userpassword");
        
        if(st1.equals("nehajagtap")||st2.equals("neha123"))
        {
            out.print("<h3> WELCOME </h3>");
        }
        else
        {
             RequestDispatcher rr = req.getRequestDispatcher("index.html");
             rr.forward(req,resp);
        }

    }
    
}
