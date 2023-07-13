package com.bhanu.customerdata.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bhanu.customerdata.dto.Customer;

public class customerdao
{
 public String save(Customer customer)
 {
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/user_data";
		String user="root";
		String password="ROOT";
		Connection c = DriverManager.getConnection(url,user,password);
		String querY="INSERT INTO customer(name,email,address,contact)"+"VALUES(?,?,?,?)";
		PreparedStatement ps = c.prepareStatement(querY);
		ps.setString(1, customer.getName());
		ps.setString(2, customer.getEmail());
		ps.setString(3, customer.getAddress());
		ps.setString(4, customer.getContact());
		
		int res = ps.executeUpdate();
		c.close();
		return "no of row added="+res;
	} catch (ClassNotFoundException | SQLException e) {
	
		e.printStackTrace();
	}
	 return null;
 }
 
 public Customer get_by_id(int id)
 {
	 try {
		Customer customer = new  Customer();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/user_data";
		String user="root";
		String password="ROOT";
		Connection c = DriverManager.getConnection(url,user,password);
		String querY="SELECT * FROM customer WHERE id=?";
		PreparedStatement ps = c.prepareStatement(querY);
		ps.setInt(1,id);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
		customer.setId(rs.getInt(1));
		 customer.setName(rs.getString(2));
		 customer.setContact(rs.getString(3));
		 customer.setAddress(rs.getString(4));
		 customer.setEmail(rs.getString(5));
		}
		c.close();
		return  customer;
	} catch (ClassNotFoundException | SQLException e) {
	
		e.printStackTrace();
	}
	 return null;
 }
}