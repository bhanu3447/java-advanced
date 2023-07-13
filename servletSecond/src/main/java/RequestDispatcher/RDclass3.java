package RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rd3")
public class RDclass3 extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
 {
//	PrintWriter w = resp.getWriter();
//	w.println("resp from servlet3");
//    w.println("</h1>"+req.getParameter("name")+"</h1>");
//    w.println(req.getParameter("email"));
	 
	 
	 String id = req.getParameter("id");
	 String name=req.getParameter("name");
	 String email = req.getParameter("email");
	 PrintWriter w = resp.getWriter();
	 w.println(id);
	 w.println(name);
	 w.println(email);

 }
}
