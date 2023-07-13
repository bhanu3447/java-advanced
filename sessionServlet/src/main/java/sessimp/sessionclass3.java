package sessimp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sess3")
public class sessionclass3 extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession s = req.getSession();
	Object o = s.getAttribute("student");
//	resp.setContentType("text/html");
	
//	String id = (String) s.getAttribute("id");
//	String name = (String) s.getAttribute("name");
//	String email = (String) s.getAttribute("email");
	
//	System.out.pvdrintln(id);
//	System.out.println(name);
//	System.out.println(email);
	
	
	PrintWriter w = resp.getWriter();
	w.print("<body bgcolor=yellow>");
	w.print("<h1>"+o+"</h1>");
	w.print("</body>");
	w.print(o);
	w.println("<center>"+o+"</center>");
 }
}
