package RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rd2")
public class RDclass2  extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
 {
	PrintWriter w = resp.getWriter();
	w.println("reahed servlet 2");
	w.println(req.getParameter("id"));
	RequestDispatcher rD= req.getRequestDispatcher("/rd3");
	rD.include(req, resp);
 }
}
