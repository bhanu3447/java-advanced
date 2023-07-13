package crudOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import com.mysql.cj.jdbc.Driver;

public class TestSelect 
{
	public static void main(String[] args) throws IOException 
	  {
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_intro";
			FileInputStream f=new  FileInputStream("mydbinfo.properties");
			Properties p=new Properties();
			p.load(f);
			Connection c=DriverManager.getConnection(url,p);
			Statement s=c.createStatement();
			String query="SELECT * FROM student";
		    boolean res=s.execute(query);
			System.out.println(res);
			ResultSet rs=s.getResultSet();
			System.out.println(rs);
			while(rs.next())
			{
			 System.out.println(rs.getInt(1));
			 System.out.println(rs.getString(2));
			 System.out.println(rs.getString(3));
			 System.out.println(rs.getString(4));
			}
			c.close();
		} catch (ClassNotFoundException |IOException | SQLException e) {
			e.printStackTrace();
		}
		
	  }
	}



//  public static void main(String[] args) throws IOException 
//  {
//	try {
//		Driver d=new Driver();
//		DriverManager.registerDriver(d);
//		FileInputStream f=new  FileInputStream("mydbinfo.properties");
//		Properties p=new Properties();
//		p.load(f);
//		String url="jdbc:mysql://localhost:3306/jdbc_intro";
//		Connection c=DriverManager.getConnection(url,p);
//		Statement s=c.createStatement();
//		String query="SELECT * FROM student";
//	    boolean res=s.execute(query);
//		System.out.println(res);
//		ResultSet rs=s.getResultSet();
//		System.out.println(rs);
//		while(rs.next())
//		{
//		 System.out.println(rs.getInt(1));
//		 System.out.println(rs.getString(2));
//		 System.out.println(rs.getString(3));
//		 System.out.println(rs.getString(4));
//		}
//		c.close();
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//	
//  }
//}

