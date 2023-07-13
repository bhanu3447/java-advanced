package cookimp2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cooklogin")
public class cookclass1 extends HttpServlet
{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String user = req.getParameter("user");
	String password = req.getParameter("password");
	
	Cookie cookie1 = new Cookie("user",user);
	Cookie cookie2 = new Cookie("password",password);
	
	resp.addCookie(cookie1);
	resp.addCookie(cookie2);
	resp.sendRedirect("cooklogin2");
}
}
