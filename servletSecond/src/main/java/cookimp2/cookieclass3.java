package cookimp2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cooklogin3")
public class cookieclass3  extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Cookie[] c = req.getCookies();
	String user=null;
	String password=null;
	for(Cookie s:c)
	{
	 if(s.getName().equals("user"))	
	 {
		 user=s.getValue();
	 }
	 
	 if(s.getName().equals("password"))
	 {
		 password=s.getValue();
	 }
	}
	 
	 PrintWriter w = resp.getWriter();
	 w.println(user);
	 w.println(password);
	
}
}
