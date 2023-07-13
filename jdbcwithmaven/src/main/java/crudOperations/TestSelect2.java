

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

public class TestSelect2 
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
		    ResultSet rs=s.executeQuery(query);
			System.out.println(rs);
			
			while(rs.next())
			{
			 System.out.println(rs.getInt(1));
			 System.out.println(rs.getString(2));
			 System.out.println(rs.getString(3));
			 System.out.println(rs.getString(4));
			 System.out.println("_______________________");
			}
			c.close();
		} catch (ClassNotFoundException |IOException | SQLException e) {
			e.printStackTrace();
		}
		
	  }
}