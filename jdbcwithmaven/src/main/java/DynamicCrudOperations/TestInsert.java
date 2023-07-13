package DynamicCrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsert 
{
  public static void main(String[] args)
  {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc_intro";
		String user="root";
		String password="ROOT";
		String query="INSERT INTO student VALUES(?,?,?,?)";
		Connection c=DriverManager.getConnection(url,user,password);
		PreparedStatement ps = c.prepareStatement(query);
		ps.setInt(1, 101);
		ps.setString(2, "bp");
		ps.setString(3,"mvc");
		ps.setString(4, "rama@gmail.com");
		int res = ps.executeUpdate();
		System.out.println(res);
		c.close();
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
 }
}
