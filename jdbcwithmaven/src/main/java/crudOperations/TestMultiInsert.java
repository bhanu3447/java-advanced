package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMultiInsert
{
    public static void main(String[] args)
    {
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc_intro";
		String user="root";
		String password="ROOT";
		Connection c=DriverManager.getConnection(url,user,password);
	    Statement s= c.createStatement();
	    s.addBatch("INSERT INTO student VALUES(96,'bfhanu good boy:)','javan','bhfanu@3687@gmail.com')");
	    s.addBatch("INSERT INTO student VALUES(11,'hemafnth erripuku','j2ffe','j26e@ngmail.com')");
	    s.addBatch("INSERT INTO student VALUES(98,'tifger kojja','htffffffml','hthml@87@gmail.com')");
	    s.addBatch("INSERT INTO student VALUES(75,'rockfey kgf','sql','sql@2687@ghmail.com')");
	    
	    int[]res=s.executeBatch();
	    s.clearBatch();
	    System.out.println(res.length);
	    c.close();
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	}
}
