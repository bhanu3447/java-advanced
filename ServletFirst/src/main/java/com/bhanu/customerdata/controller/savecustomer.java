package com.bhanu.customerdata.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bhanu.customerdata.dao.customerdao;
import com.bhanu.customerdata.dto.Customer;

public class savecustomer extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
	
	     String name= req.getParameter("name");
	     String email= req.getParameter("email");
	     String address= req.getParameter("address");
	     String contact= req.getParameter("contact");
	    
	     
//	     System.out.println(name);
//	     System.out.println(email);
//	     System.out.println(address);
//	     System.out.println(contact);
	     
	     Customer customer = new Customer();
	     customer.setName(name);
	     customer.setEmail(email);
	     customer.setAddress(address);
	     customer.setContact(contact);
	     
	     customerdao customerdao = new customerdao();
	     PrintWriter writer = res.getWriter();
	     writer.print(customerdao.save(customer));
	
		
	}

}

//public class savecustomer extends HttpServlet
//{
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
//    {
//	     String name= req.getParameter("name");
//	     String email= req.getParameter("email");
//	     String address= req.getParameter("address");
//	     String contact= req.getParameter("contact");
//	    
//	     
////	     System.out.println(name);
////	     System.out.println(email);
////	     System.out.println(address);
////	     System.out.println(contact);
//	     
//	     Customer customer = new Customer();
//	     customer.setName(name);
//	     customer.setEmail(email);
//	     customer.setAddress(address);
//	     customer.setContact(contact);
//	     
//	     customerdao customerdao = new customerdao();
//	     PrintWriter writer = resp.getWriter();
//	     writer.print(customerdao.save(customer));
//
//	}
//
//}