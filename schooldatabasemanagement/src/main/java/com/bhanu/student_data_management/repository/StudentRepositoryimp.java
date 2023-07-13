package com.bhanu.student_data_management.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bhanu.student_data_management.dto.Student;
import com.bhanu.student_data_management.util.AppConstants;
import com.bhanu.student_data_management.util.ConnectionUtil;

public class StudentRepositoryimp implements StudentRepository {

//	@Override
//	public Connection getConnection() {
//		try 
//		{
//			Class.forName(AppConstants.DRIVERNAME);
//			String url = AppConstants.DB_URL;
//			String user = AppConstants.DB_USERNAME;
//			String password = AppConstants.DB_PASSWORD;
//
//			return DriverManager.getConnection(url, user, password);
//
//		} catch (ClassNotFoundException | SQLException e) {
//
//			e.printStackTrace();
//		}
//		return null;
//
//	}

	
/*
	*
	*this method is used to achieve connection with database
	*
*/
	
	
	
	public Connection getConnection() {
		return ConnectionUtil.getConnection();
	}

	
	@Override
	public Student studentLogin(String email, String password)
	{
		Connection connection = getConnection();
		String query="select * from student where email=? and password=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				
//				id, name, email, standard, section, over_all_percentage, gender, parent_contact, remarks, address, password
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setStandard(rs.getString(4));
				s.setSection(rs.getString(5));
				s.setOverallPercentage(rs.getString(6));
				s.setGender(rs.getString(7));
				s.setParentContact(rs.getString(8));
				s.setRemarks(rs.getString(9));
				s.setAddress(rs.getString(10));
				s.setPassword(rs.getString(11));
				
			  return s;	
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String saveStudent(Student student)
	{
		Connection connection = getConnection();
		String query="insert into student ( name, email, standard, section, over_all_percentage, gender, parent_contact, remarks, address, password) values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getStandard());
			ps.setString(4, student.getSection());
			ps.setString(5, student.getOverallPercentage());
			ps.setString(6, student.getGender());
			ps.setString(7, student.getParentContact());
			ps.setString(8, student.getRemarks());
			ps.setString(9, student.getAddress());
			ps.setString(10, student.getPassword());
			
			int res = ps.executeUpdate();
			return  res+"rows of data added successfully";
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Student getStudentById(int id) 
	{
		Connection connection = getConnection();
		String query="select * from student where id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setStandard(rs.getString(4));
				s.setSection(rs.getString(5));
				s.setOverallPercentage(rs.getString(6));
				s.setGender(rs.getString(7));
				s.setParentContact(rs.getString(8));
				s.setRemarks(rs.getString(9));
				s.setAddress(rs.getString(10));
				s.setPassword(rs.getString(11));
				
				return s;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public String deleteStudentById(int id)
	{
		
		try {
			Connection connection = getConnection();
			String query="delete from student where id=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			int r = ps.executeUpdate();
			
			return  "delete success of  "+r;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Student updateStudent(Student student) 
	{
//		id, name, email, standard, section, over_all_percentage, gender, parent_contact, remarks, address, password

		Connection con = getConnection();
		String query="update student set name=?, email=?, standard=?, section=?, over_all_percentage=?, gender=?, parent_contact=?, remarks=?, address=?, password=? where id=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getStandard());
			ps.setString(4, student.getSection());
			ps.setString(5, student.getOverallPercentage());
			ps.setString(6, student.getGender());
			ps.setString(7, student.getParentContact());
			ps.setString(8, student.getRemarks());
			ps.setString(9, student.getAddress());
			ps.setString(10, student.getPassword());
			ps.setInt(11,student.getId());

			int r = ps.executeUpdate();
			if(r==0)
			{
				throw new SQLException("update failed,now rows affected");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public List<Student> getStudentByStandard(String standard)
	{
		Connection con = getConnection();
       List <Student> l = new ArrayList<>();
       String query="select * from student where standard=?";
       try {
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, standard);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			
			Student s=new Student();
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setEmail(rs.getString(3));
			s.setStandard(rs.getString(4));
			s.setSection(rs.getString(5));
			s.setOverallPercentage(rs.getString(6));
			s.setGender(rs.getString(7));
			s.setParentContact(rs.getString(8));
			s.setRemarks(rs.getString(9));
			s.setAddress(rs.getString(10));
			s.setPassword(rs.getString(11));
			l.add(s);
		}
		return l;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}

	@Override
	public List<Student> getStudentByStandardAndSection(String standard, String section) 
	{
		
		Connection con = getConnection();
	       List <Student> l = new ArrayList<>();
	       String query="select * from Student where standard=? and section=?";
	       try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, standard);
			ps.setString(2, section);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setStandard(rs.getString(4));
				s.setSection(rs.getString(5));
				s.setOverallPercentage(rs.getString(6));
				s.setGender(rs.getString(7));
				s.setParentContact(rs.getString(8));
				s.setRemarks(rs.getString(9));
				s.setAddress(rs.getString(10));
				s.setPassword(rs.getString(11));
				l.add(s);
			}
			return l;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> getStudentBetweenPercentage(String lower, String high) 
	{
		Connection con = getConnection();
	       List <Student> l = new ArrayList<>();
	       String query="select * from Student where over_all_percentage between ? and ?";
	       try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, lower);
			ps.setString(2, high);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setStandard(rs.getString(4));
				s.setSection(rs.getString(5));
				s.setOverallPercentage(rs.getString(6));
				s.setGender(rs.getString(7));
				s.setParentContact(rs.getString(8));
				s.setRemarks(rs.getString(9));
				s.setAddress(rs.getString(10));
				s.setPassword(rs.getString(11));
				l.add(s);
			}
			return l;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Student> getALLStudent() {
		Connection con = getConnection();
	       List <Student> l = new ArrayList<>();
	       String query="select * from Student ";
	       try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setStandard(rs.getString(4));
				s.setSection(rs.getString(5));
				s.setOverallPercentage(rs.getString(6));
				s.setGender(rs.getString(7));
				s.setParentContact(rs.getString(8));
				s.setRemarks(rs.getString(9));
				s.setAddress(rs.getString(10));
				s.setPassword(rs.getString(11));
				l.add(s);
			}
			return l;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}
