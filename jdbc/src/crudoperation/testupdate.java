package crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class testupdate 
{
 public static void main(String[] args) throws ClassNotFoundException 
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 try(Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_intro?user=root&password=ROOT");)
	 {
		System.out.println("connected"); 
		Statement s=c.createStatement();
		String query="UPDATE student SET name='pspk' WHERE "+"name='tiger'";
		int res=s.executeUpdate(query);
		System.out.println("number of rows updated="+res);
	 } catch (SQLException e) 
	 {
		e.printStackTrace();
	}
 }
}
