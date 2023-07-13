package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class testinsert3
{
  public static void main(String[] args)
  {
	try {
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		String url="jdbc:mysql://localhost:3306/jdbc_intro?user=root&password=ROOT";
		Connection c=DriverManager.getConnection(url);
		System.out.println("connected");
		Statement s=c.createStatement();
		String sql="INSERT INTO student(id,name,course,email)"+"VALUES"+"(4,'bhanu','java','bhanugoud2001@gmail.com')";
		int res=s.executeUpdate(sql);
		System.out.println("no of rows updated="+res);
    } catch (SQLException e)
	{
		e.printStackTrace();
	}
  }
}
