package sess2withreqdispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/requ2")
public class request2 extends HttpServlet
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
   HttpSession s = req.getSession();
   customer c = (customer)s.getAttribute("customer");
   c.setAddress(c.getAddress().toUpperCase());
   c.setAge(c.getAge()+18);
 
   
   s.setAttribute("customer",c);
   
	
	RequestDispatcher rd = req.getRequestDispatcher("traildisplay2.jsp");
	rd.forward(req, resp);
 }
}
