package com.bhanu.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uemail=request.getParameter("username");
		String upwd=request.getParameter("password");
		
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher=null;
		if(uemail==null||uemail.equals(""))
		{
			request.setAttribute("status","invalidemail");
			dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);

		}
		if(upwd==null||upwd.equals(""))
		{
			request.setAttribute("status","invalidpassword");
			dispatcher=request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);

		}
		Connection c=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationlogin?useSSL=false","root","ROOT");
			PreparedStatement ps = c.prepareStatement("select * from users where uemail=? and upwd=?");
			ps.setString(1, uemail);
			ps.setString(2, upwd);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				session.setAttribute("name", rs.getString("uname"));
				dispatcher=request.getRequestDispatcher("index.jsp");
			}
			else
			{
				request.setAttribute("status", "failed");
				dispatcher=request.getRequestDispatcher("login.jsp");
			}
			dispatcher.forward(request, response);
			c.close();
		}catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
		}
		}
	}

