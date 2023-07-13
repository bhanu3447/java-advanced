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
@WebServlet("/get_by_id")
public class get_by_id extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int id=Integer.parseInt(req.getParameter("id"));
		customerdao customerdao = new customerdao();
		Customer c=customerdao.get_by_id(id);
		PrintWriter writer = res.getWriter();
		writer.print(c);
		
	}
}
