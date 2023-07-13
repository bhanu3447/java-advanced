package sessionwithreqdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/req2")
public class reqclass2  extends HttpServlet
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
 {
	 RequestDispatcher rd = req.getRequestDispatcher("traildisplay.jsp");
	 req.setAttribute("class", "jee class");
	 rd.forward(req, resp);
	 
	 
	 
//	RequestDispatcher rd = req.getRequestDispatcher("traildisplay.jsp");
//	rd.forward(req, resp);
	 
	 
	 

	
//	HttpSession s = req.getSession();                //singleton class
//	String id=(String) s.getAttribute("id");
//	String name=(String) s.getAttribute("name");
//	String email=(String) s.getAttribute("email");
//	
//	
//	PrintWriter w = resp.getWriter();
//	w.println(id);
//	w.println(name);
//	w.println(email);
	
 }
}
