package logindetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome1")
public class welcome  extends HttpServlet
{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
  {
	String username = req.getParameter("username");
	String password = req.getParameter("password");
	RequestDispatcher rD = req.getRequestDispatcher("invalid1");
//	req.setAttribute(username, password);
//	
	PrintWriter w = resp.getWriter();
	if(username.equals("bhanu")&&password.equals("9550218144"))
	{
		rD.forward(req, resp);
	}
	else
	{
		w.print("invalid credentials");
	}
	
}
}
