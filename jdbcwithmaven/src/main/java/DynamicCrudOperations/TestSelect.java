package DynamicCrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSelect 
{
 public static void main(String[] args) throws SQLException 
 {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc_intro";
		String user="root";
		String password="ROOT";
		Connection c= DriverManager.getConnection(url,user,password);
		String query="SELECT * FROM student ";
//		String query="SELECT * FROM student WHERE name=? ";
		PreparedStatement ps = c.prepareStatement(query);
//		ps.setString(1, "tiger ");
		ResultSet rs = ps.executeQuery();
		System.out.println(rs);
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println("____________________");
		}
		c.close();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
 }
}



//
//package DynamicCrudOperations;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class TestSelect 
//{
// public static void main(String[] args) throws SQLException 
// {
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		String url="jdbc:mysql://localhost:3306/jdbc_intro";
//		String user="root";
//		String password="ROOT";
//		Connection c= DriverManager.getConnection(url,user,password);
//		String query="SELECT * FROM student ";
//		PreparedStatement ps = c.prepareStatement(query);
//		ResultSet rs = ps.executeQuery();
//		System.out.println(rs);
//		while(rs.next())
//		{
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
//			System.out.println(rs.getString(4));
//			System.out.println("____________________");
//		}
//		c.close();
//	} catch (ClassNotFoundException e) {
//		e.printStackTrace();
//	}
// }
//}
//
