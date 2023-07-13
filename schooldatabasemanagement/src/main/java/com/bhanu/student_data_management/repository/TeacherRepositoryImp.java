package com.bhanu.student_data_management.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bhanu.student_data_management.dto.Teacher;
import com.bhanu.student_data_management.util.ConnectionUtil;

public class TeacherRepositoryImp implements TeacherRepository
{

	public Connection getConnection() {
		return ConnectionUtil.getConnection();
	}


	@Override
	public String saveTeacher(Teacher teacher) 
	{
		Connection con = getConnection();
		String query="insert into teacher( name, email, contact, subject, class_teacher, salary, address, password) values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,teacher.getName());
			ps.setString(2,teacher.getEmail());
			ps.setString(3,teacher.getContact());
			ps.setString(4,teacher.getSubject());
			ps.setString(5,teacher.getClassteacher());
			ps.setInt(6,teacher.getSalary());
			ps.setString(7,teacher.getAddress());
			ps.setString(8,teacher.getPassword());
		
			
			int res=ps.executeUpdate();
			return "no of rows added "+res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	@Override
	public Teacher TeaherLogin(String email, String password) {
		Connection connection = getConnection();
		String query="select * from teacher where email=? and password=?";
//		id, name, email, contact, subject, class_teacher, salary, address, password
		Teacher t = new Teacher();
			try {
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setString(1, email);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				if(rs.next())
				{
					
					t.setId(rs.getInt(1));
					t.setName(rs.getString(2));
					t.setEmail(rs.getString(3));
					t.setContact(rs.getString(4));
					t.setSubject(rs.getString(5));
					t.setClassteacher(rs.getString(6));
					t.setSalary(rs.getInt(7));
					t.setAddress(rs.getString(8));
					t.setPassword(rs.getString(9));
					
					return t;
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			

	}



	@Override
	public Teacher getTeacherById(int id) 
	{
//		id, name, email, contact, subject, class_teacher, salary, address, password
		Connection con = getConnection();
		String query="select * from teacher where id=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Teacher t = new Teacher();
				t.setId(rs.getInt(1));
				t.setName(rs.getString(2));
				t.setEmail(rs.getString(3));
				t.setContact(rs.getString(4));
				t.setSubject(rs.getString(5));
				t.setClassteacher(rs.getString(6));
				t.setSalary(rs.getInt(7));
				t.setAddress(rs.getString(8));
				t.setPassword(rs.getString(9));
				
				return t;
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deleteTeacher(int id) {
		Connection con = getConnection();
		String query="delete from teacher where id=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			int res = ps.executeUpdate();
			return "no of rows deleted "+res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {

		 Connection con = getConnection();
		 String query="update teacher set name=?, email=?, contact=?, subject=?, class_teacher=?, salary=?, address=?, password=? where id=?";
		 
		 try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,teacher.getName());
			ps.setString(2,teacher.getEmail());
			ps.setString(3,teacher.getContact());
			ps.setString(4,teacher.getSubject());
			ps.setString(5,teacher.getClassteacher());
			ps.setInt(6,teacher.getSalary());
			ps.setString(7,teacher.getAddress());
			ps.setString(8,teacher.getPassword());
			ps.setString(8,teacher.getPassword());
			ps.setInt(9,teacher.getId());
			
			 ps.executeUpdate();
			 return teacher;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return null;
		 		
	}

	@Override
	public List<Teacher> getTeacherBySubject(String subject)
	{
	       List<Teacher> l = new ArrayList<>();
		Connection con = getConnection();
		String query="select * from teacher where subject=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, subject);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
//				id, name, email, contact, subject, class_teacher, salary, address, password

				Teacher t = new Teacher();
				t.setId(rs.getInt(1));
				t.setEmail(rs.getString(2));
			    t.setEmail(rs.getString(3));
			    t.setContact(rs.getString(4));
			    t.setSubject(rs.getString(5));
			    t.setClassteacher(rs.getString(6));
			    t.setSalary(rs.getInt(7));
			    t.setAddress(rs.getString(8));
			    t.setPassword(rs.getString(9));
			    
				l.add(t);
			}
			return l;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Teacher> getClassTeacher(String standard) {
		  List<Teacher> l = new ArrayList<>();
			Connection con = getConnection();
			String query="select * from teacher where standard=?";
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, standard);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
//					id, name, email, contact, subject, class_teacher, salary, address, password

					Teacher t = new Teacher();
					t.setId(rs.getInt(1));
					t.setEmail(rs.getString(2));
				    t.setEmail(rs.getString(3));
				    t.setContact(rs.getString(4));
				    t.setSubject(rs.getString(5));
				    t.setClassteacher(rs.getString(6));
				    t.setSalary(rs.getInt(7));
				    t.setAddress(rs.getString(8));
				    t.setPassword(rs.getString(9));
				    
					l.add(t);
				}
				return l;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public List<Teacher> getTeacherBySal(int sal) {
		 List<Teacher> l = new ArrayList<>();
			Connection con = getConnection();
			String query="select * from teacher where salary=?";
			try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, sal);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
//					id, name, email, contact, subject, class_teacher, salary, address, password

					Teacher t = new Teacher();
					t.setId(rs.getInt(1));
					t.setEmail(rs.getString(2));
				    t.setEmail(rs.getString(3));
				    t.setContact(rs.getString(4));
				    t.setSubject(rs.getString(5));
				    t.setClassteacher(rs.getString(6));
				    t.setSalary(rs.getInt(7));
				    t.setAddress(rs.getString(8));
				    t.setPassword(rs.getString(9));
				    
					l.add(t);
				}
				return l;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public List<Teacher> getAllTeacher() {
		List<Teacher> l = new ArrayList<>();
		Connection con = getConnection();
		String query="select * from teacher ";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
//				id, name, email, contact, subject, class_teacher, salary, address, password

				Teacher t = new Teacher();
				t.setId(rs.getInt(1));
				t.setEmail(rs.getString(2));
			    t.setEmail(rs.getString(3));
			    t.setContact(rs.getString(4));
			    t.setSubject(rs.getString(5));
			    t.setClassteacher(rs.getString(6));
			    t.setSalary(rs.getInt(7));
			    t.setAddress(rs.getString(8));
			    t.setPassword(rs.getString(9));
			    
				l.add(t);
			}
			return l;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}




}
