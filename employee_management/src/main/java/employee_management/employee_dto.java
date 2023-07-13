package employee_management;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhanu.customerdata.dao.customerdao;

// class employee_dto extends GenericServlet
//{
//
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
//	{
//		String name = req.getParameter("name");
//		String contactno= req.getParameter("contact");
//		String email = req.getParameter("email");
//
//		
//		employee e= new employee();
//		e.setContact(contactno);
//		e.setEmail(email);
//		e.setName(name);
//		
//		employee_dao employee_dao = new employee_dao();
//		PrintWriter w = res.getWriter();
//		w.print(employee_dao.save(e));
//	}
//}
 @WebServlet("/getDataByName")
 
 class getDataByName extends HttpServlet
 {

	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	 {
		
		 
		String s = req.getParameter("name");
		employee_dao e = new employee_dao();
		employee emp=e.getDataByName(name);
		 PrintWriter writer = resp.getWriter();
		 writer.print(e1);
 	}
 }




