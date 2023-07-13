package responseredirect2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sendresp")
public class response1 extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	System.out.println("data from 1st servlet");
	String id = req.getParameter("id");
	String name = req.getParameter("name");
	String email= req.getParameter("email");
	System.out.println(id);
	System.out.println(name);
	System.out.println(email);
	
	
	resp.sendRedirect("sendresp2?k=");

}
}
