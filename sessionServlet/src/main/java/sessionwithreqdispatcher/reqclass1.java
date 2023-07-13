package sessionwithreqdispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/req1")
public class reqclass1 extends HttpServlet
{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
  {
	String id = req.getParameter("id");
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	System.out.println(id);
	System.out.println(name);
	System.out.println(email);
	
	HttpSession s = req.getSession();
	s.setAttribute("id", id);
	s.setAttribute("name", name);
	s.setAttribute("email", email);
	
	RequestDispatcher rd = req.getRequestDispatcher("req2");
	rd.forward(req, resp);
  }
}
