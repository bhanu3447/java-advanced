package studentapi;

import java.sql.Connection;
import java.util.List;

public interface studentrepository 
{
  public Connection getconnectionutil();
  
  public String savestudent(student student);
  
  public String updatestudentbyid(student student );
  
  public String deletestudentbyid(int id );
  
  public student getstudentbyid(int id );
  
  public List<student> getstudentdetails();


}
