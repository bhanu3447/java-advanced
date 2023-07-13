package sess2withreqdispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/requ1")
public class request1 extends HttpServlet 
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
 {
	String id = req.getParameter("id");
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	String age = req.getParameter("age");
	String address = req.getParameter("address");
	
	
	customer c = new customer();
	c.setId(Integer.parseInt(id));
	c.setAddress(address);
	c.setEmail(email);
	c.setName(name);
	c.setAge(Integer.parseInt(age));
	

	HttpSession s = req.getSession();
	s.setAttribute("customer", c);

	
	
	RequestDispatcher rd = req.getRequestDispatcher("requ2");
	rd.forward(req, resp);
	
}
}
