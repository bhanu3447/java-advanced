package employee_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class employee_dao
{
  public String save(employee e)
  {
	  try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/emp_data";
			String user="root";
			String password="ROOT";
			Connection c = DriverManager.getConnection(url,user,password);
		
		String query="INSERT INTO empdetails(name,contact,email)"+"VALUES(?,?,?)";
		PreparedStatement ps = c.prepareStatement(query);
		ps.setString(1,e.getName());
		ps.setString(2,e.getContact());
		ps.setString(3,e.getEmail());
		int res = ps.executeUpdate();
		c.close();
		return "no of row added="+res;
	} catch (ClassNotFoundException | SQLException e1) {
		e1.printStackTrace();
	}
	return null;
  }
  public employee getDataByName(String s)
  {
	  try {
		  employee e = new employee();
		   Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/emp_data";
			String user="root";
			String password="ROOT";
			Connection c = DriverManager.getConnection(url,user,password);
		
		String query="SELECT * FROM empdetails WHERE name=?";
		PreparedStatement ps = c.prepareStatement(query);
		ps.setString(1,s);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
		  e.setName(rs.getString(1));	
		  e.setContact(rs.getString(2));
		  e.setEmail(rs.getString(3));
		}
		c.close();
		return e;
	} catch (ClassNotFoundException | SQLException e1) {
		e1.printStackTrace();
	}
	return null;
  }
}
