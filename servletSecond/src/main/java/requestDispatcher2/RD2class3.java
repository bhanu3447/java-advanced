package requestDispatcher2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/rd2class3")
public class RD2class3 extends HttpServlet
{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  {
	  PrintWriter w = resp.getWriter();
	  w.print("rdclass3");
	  String name = req.getParameter("name");
	  String id = req.getParameter("id");
	  String email= req.getParameter("email");
	  String age = req.getParameter("age");
	  
	  
	  
	  w.print(name);
	  w.print(id);
	  w.print(email);
	  w.print(age);
}
}
