package com.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sq")
public class sqservlet extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	 
	 String id = req.getParameter("k");
	 PrintWriter w = resp.getWriter();
	 w.print(id);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //	int k=(int) req.getAttribute("s");
//	k=k*k;
//	 PrintWriter w = resp.getWriter();
//	w.print("result="+k);
}
}
