package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginsess1")
public class loginsession1 extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	String username = req.getParameter("username");
	String password = req.getParameter("password");
	
	HttpSession s = req.getSession();
	s.setAttribute("username",username);
	s.setAttribute("password", password);
	
	resp.sendRedirect("loginsess2");
	
}
}
