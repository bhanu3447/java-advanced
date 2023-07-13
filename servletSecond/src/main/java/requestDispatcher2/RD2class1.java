package requestDispatcher2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/rd2class1")
public class RD2class1 extends HttpServlet
{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
  {
	
	
	RequestDispatcher rD = req.getRequestDispatcher("rd2class2");
	rD.forward(req, resp);
	PrintWriter w = resp.getWriter();
	w.print("rd2class1");
	
	
	
 } 
}
