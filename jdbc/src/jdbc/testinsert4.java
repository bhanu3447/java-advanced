package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class testinsert4 
{
 public static void main(String[] args) 
 {
	 Driver d;
		 try {
			 d=new Driver();
			 DriverManager.registerDriver(d);
			 FileInputStream f=new FileInputStream("mydbinfo.properties");
			 Properties p=new Properties();
			 p.load(f);
			 String url="jdbc:mysql://localhost:3306/jdbc_intro";
			 Connection c=DriverManager.getConnection(url,p);
			 System.out.println("connected");
		} catch (SQLException | IOException e) {
	
			e.printStackTrace();
		}
	
 }
}
