package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet
{

//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
//	{
//		String name=req.getParameter("name");
//		String country=req.getParameter("country");
//		String skills=req.getParameter("skills");
//		String exp=req.getParameter("exp");
//		
//		PrintWriter out = res.getWriter();
//		out.print(name);
//		out.print(country);
//		out.print(skills);
//		out.print(exp);
//		
//	}
//}
//
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	{
		String name=req.getParameter("name");
		String country=req.getParameter("country");
		String skills=req.getParameter("skills");
		String exp=req.getParameter("exp");
		
		PrintWriter out = resp.getWriter();
		out.print(name);
		out.print(country);
		out.print(skills);
		out.print(exp);
		
	}


	}}
