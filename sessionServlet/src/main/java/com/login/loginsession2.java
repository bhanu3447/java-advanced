package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginsess2")
public class loginsession2 extends HttpServlet
{
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
 {
	HttpSession s = req.getSession();
    String username = (String) s.getAttribute("username");
    String password = (String) s.getAttribute("password");
    
    if(username.equals("bhanu")&&password.equals("9550218144"))
    {
	resp.sendRedirect("wel");
    }
    else
    {
    	resp.sendRedirect("inv");
    }
	
 }
}
