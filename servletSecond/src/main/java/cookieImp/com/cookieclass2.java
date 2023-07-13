package cookieImp.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookie2")
public class cookieclass2 extends HttpServlet
{
 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
 {
 Cookie[] cookies = req.getCookies();
 String id=null;
 String name=null;
 String email=null;
 for(Cookie c:cookies)
  {
	if(c.getName().equals("id")) 
		{
		id=c.getValue();
		c.setMaxAge(20);
		}
	if(c.getName().equals("name")) 
      {
		name=c.getValue();
		c.setMaxAge(20);
       }
	
	if(c.getName().equals("email")) 
		{
		email=c.getValue();
		c.setMaxAge(20);
		}
		
	
  }
//  System.out.println(id);
//  System.out.println(name);
//  System.out.println(email);
  
  PrintWriter w = resp.getWriter();
  w.println(id);
  w.println(name);
  w.println(email);
 }
}
