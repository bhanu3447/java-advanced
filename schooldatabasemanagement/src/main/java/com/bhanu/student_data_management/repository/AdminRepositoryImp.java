package com.bhanu.student_data_management.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bhanu.student_data_management.dto.Admin;
import com.bhanu.student_data_management.util.ConnectionUtil;

public class AdminRepositoryImp implements AdminRepository
{

	public Connection getConnection() {
		return ConnectionUtil.getConnection();
	}
	
	
	@Override
	public String saveAdmin(Admin admin) 
	{
		
	   Connection con = getConnection();
	   String query="insert into admin (adminName, password) values(?,?)";
	   try {
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, admin.getAdminName());
		ps.setString(2, admin.getPassword());
		
		int res = ps.executeUpdate();
		return res+"  row of data added succesfully";
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return null;
	}

	@Override
	public Admin adminLogin(String adminName, String password) 
	{
		Connection con = getConnection();
		String query="select * from admin where adminName=? and password=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, adminName);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Admin admin = new Admin();
				admin.setAdminName(rs.getString(2));
				admin.setPassword(rs.getString(3));
				
				return admin;
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

}
