
package studentapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class studentrepositoryimp  implements  studentrepository
{

	@Override
	public Connection getconnectionutil() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_intro";
			String user="root";
			String password="ROOT";
		    Connection c=DriverManager.getConnection(url,user,password);
//		    System.out.println("connected");
		    return c;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
		return null;
	}

	@Override
	public String savestudent(student student) 
	{
		Connection c = getconnectionutil();
		String query="INSERT INTO student (id,name,course,email) VALUES(?,?,?,?)";
		try {
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getCourse());
			ps.setString(4, student.getEmail());
			int res= ps.executeUpdate();
			c.close();
			return "no of rows added="+res;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public String updatestudentbyid(student student) 
	{
		Connection c = getconnectionutil();
		String query="UPDATE student set name=?,course=?,email=? WHERE id=?";
		try {
			PreparedStatement ps = c.prepareStatement(query);
			ps.setString(1,student.getName());
			ps.setString(2,student.getCourse());
			ps.setString(3,student.getEmail());
			ps.setInt(4,student.getId());
			int res= ps.executeUpdate();
			c.close();
			return "no of rows updated="+res;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deletestudentbyid(int id) 
	{
		Connection c = getconnectionutil();
		String query="DELETE FROM student WHERE id=?";
		try {
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, id);
			int res= ps.executeUpdate();
			c.close();
			return "no of rows deleted="+res;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public student getstudentbyid(int id)
	{
		Connection c = getconnectionutil();
		student s=new student();
		String query="SELECT * FROM student WHERE id=?";
		try {
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			if(rs.next())
			{
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setCourse(rs.getString(3));
				s.setEmail(rs.getString(4));
			}
			c.close();
			return s;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<student> getstudentdetails()
	{
		List<student> l=new ArrayList<>();
		Connection c = getconnectionutil();
		String query="SELECT * FROM student";
		try {
			PreparedStatement ps = c.prepareStatement(query);
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				student s=new student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setCourse(rs.getString(3));
				s.setEmail(rs.getString(4));
				l.add(s);
			}
			c.close();
		  return l;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

}
