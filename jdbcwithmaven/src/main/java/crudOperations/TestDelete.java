package crudOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestDelete 
{
  public static void main(String[] args) throws IOException 
  {
	try {
		Driver d=new Driver();
		DriverManager.registerDriver(d);
		FileInputStream f=new  FileInputStream("mydbinfo.properties");
		Properties p=new Properties();
		p.load(f);
		String url="jdbc:mysql://localhost:3306/jdbc_intro";
		Connection c=DriverManager.getConnection(url,p);
		Statement s=c.createStatement();
		String query="DELETE FROM student WHERE name='bhanu'";
	    int res=s.executeUpdate(query);
		System.out.println("no of rows deleted="+res);
		c.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
  }
}
