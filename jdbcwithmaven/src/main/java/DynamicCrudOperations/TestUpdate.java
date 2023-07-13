package DynamicCrudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUpdate 
{
 public static void main(String[] args) throws SQLException 
 {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc_intro";
		String user="root";
		String password="ROOT";
		Connection c= DriverManager.getConnection(url,user,password);
		String query="UPDATE student SET name=? WHERE id=?";
		PreparedStatement ps = c.prepareStatement(query);
//		ps.clearBatch();
		ps.setString(1, "ramana");
		ps.setInt(2,101);
		int res=ps.executeUpdate();
		System.out.println(res);
		c.close();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
 }
}
