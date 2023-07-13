package sessimp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sess1")
public class sessionclass1 extends HttpServlet
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
 {
	String id=req.getParameter("id");
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	
	
	HttpSession s = req.getSession();
	s.setAttribute("id", id);
	s.setAttribute("name", name);
	s.setAttribute("email", email);
	
	resp.sendRedirect("sess2");
 }
}
