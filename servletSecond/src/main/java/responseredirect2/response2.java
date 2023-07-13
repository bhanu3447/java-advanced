package responseredirect2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendresp2")
public class response2 extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 System.out.println("data from 2nd servlet");
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email= req.getParameter("email");
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		
		String k = req.getParameter("k");

		System.out.println(k);
		PrintWriter w = resp.getWriter();
		w.println("resp from second class");
		w.println(k);
	 resp.getWriter().println("resp from second class");
 }
}
