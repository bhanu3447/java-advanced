package com.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class addservlet extends  HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	 {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		resp.sendRedirect("sq?k=");
	}
	}
// @Override
//protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
// {
//	int i=Integer.parseInt(req.getParameter("num1"));
//	int j=Integer.parseInt(req.getParameter("num2"));
//	
//	int k=i+j;
//	req.setAttribute("s", k);
//	RequestDispatcher rD = req.getRequestDispatcher("sq");
//	rD.forward(req, resp);
//}
//}






//public class addservlet extends  HttpServlet
//{
// @Override
//protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
// {
//	int i=Integer.parseInt(req.getParameter("num1"));
//	int j=Integer.parseInt(req.getParameter("num2"));
//	
//	int k=i+j;
//	PrintWriter w = resp.getWriter();
//	w.print("doget");
//	w.print(k);
//}
// protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
// {
//	int i=Integer.parseInt(req.getParameter("num1"));
//	int j=Integer.parseInt(req.getParameter("num2"));
//	
//	int k=i+j;
//	PrintWriter w = resp.getWriter();
//	w.print("dopost");
//	w.print(k);
//}
//}

