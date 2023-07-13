package requestDispatcher2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/rd2class2")
public class RD2class2 extends HttpServlet
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
 {
	RequestDispatcher rD = req.getRequestDispatcher("rd2class3");
	rD.include(req, resp);
	PrintWriter writer = resp.getWriter();
	writer.print("rd2classs");
  }
}