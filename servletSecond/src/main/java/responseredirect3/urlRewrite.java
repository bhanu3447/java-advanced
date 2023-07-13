package responseredirect3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send1")
public class urlRewrite extends HttpServlet
{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
 {

	 resp.sendRedirect("send2?id=&name=");

//	 resp.sendRedirect("http://www.google.com");

	
}
}
