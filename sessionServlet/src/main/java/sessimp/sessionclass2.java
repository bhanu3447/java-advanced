package sessimp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.student;
@WebServlet("/sess2")
public class sessionclass2 extends HttpServlet 
{
  @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  {
	HttpSession s = req.getSession();
	String id = (String) s.getAttribute("id");
	String name = (String) s.getAttribute("name");
	String email = (String) s.getAttribute("email");
	
	
	student stu = new student();
	stu.setId(Integer.parseInt(id));
	stu.setName(name);
	stu.setEmail(email);
	
	s.setAttribute("student", stu);
	
	s.removeAttribute("id");
	s.removeAttribute("name");
	s.removeAttribute("email");
	
	resp.sendRedirect("display.jsp");
	
//	PrintWriter w = resp.getWriter();
//	w.println(id);
//	w.println(name);
//	w.println(email);
  }
}
