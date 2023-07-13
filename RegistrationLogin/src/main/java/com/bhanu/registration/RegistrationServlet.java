package com.bhanu.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String upwd = request.getParameter("pass");
		String umobile = request.getParameter("contact");
		 Connection c=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 c= DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationlogin?useSSL=false","root","ROOT");
			PreparedStatement ps = c.prepareStatement("insert into users(uname,upwd,uemail,umobile) values(?,?,?,?)");
			ps.setString(1, uname);
			ps.setString(2,upwd);
			ps.setString(3,uemail );
			ps.setString(4, umobile);
			
			int rowCount = ps.executeUpdate();
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("registration.jsp");
			if(rowCount>0)
			{
				request.setAttribute("status", "success");
			}
			else
			{
				request.setAttribute("status", "failed");	
			}
			requestDispatcher.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				c.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

}
