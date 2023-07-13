package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class testinsert 
{
  public static void main(String[] args) 
  {
   try 
    {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/jdbc_intro";
	String user="root";
	String password="ROOT";
	Connection c=DriverManager.getConnection(url,user,password);
	Statement s=c.createStatement();
	String sql="INSERT INTO student(id,name,course,email)"+"VALUES"+"(2,'pawankalyan','hero','pspk@jan.com')";
	boolean res=s.execute(sql);
	System.out.println(res);
	c.close();
    } catch (ClassNotFoundException | SQLException e) {
    	 e.printStackTrace();
    }
  }
}
