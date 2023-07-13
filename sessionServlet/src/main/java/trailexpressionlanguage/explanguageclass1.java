package trailexpressionlanguage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/expclass1")
public class explanguageclass1 extends HttpServlet
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	customer c=new customer();
	c.setId(req.getParameter("id"));
	c.setName(req.getParameter("name"));
	c.setEmail(req.getParameter("email"));
	c.setAge(req.getParameter("age"));
	c.setAddress(req.getParameter("address"));
	
	customer c2=new customer("1", "hemanth", "hemanth@gmail.com","0", "nellore");
	customer c3=new customer("2", "bhanu", "bhanu@gmail.com","10", "peddacherukuru");
	customer c4=new customer("3", "tiger", "tiger@gmail.com","8", "vijayawada");
	customer c5=new customer("4", "lakshman", "lakshman@gmail.com","5", "vizag");
	List<customer> l = new ArrayList<>();
	l.add(c);
	l.add(c2);
	l.add(c3);
	l.add(c4);
	l.add(c5);
	
	
//	System.out.println(c);
	
	HttpSession s = req.getSession();
	s.setAttribute("clist", l);
	resp.sendRedirect("e1display.jsp");
}
}
