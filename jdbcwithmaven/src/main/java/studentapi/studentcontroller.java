package studentapi;

import java.sql.Connection;
import java.util.List;

public class studentcontroller
{
 public static void main(String[] args) 
 {
	studentrepository r= new studentrepositoryimp();
//    Connection c=r.getconnectionutil();
//	if(c!=null)
//	{
//		System.out.println("working");
//	}else
//	{
//		System.out.println("something went wrong");
//	}
	
	
//	student s=new student();
//	s.setId(1);
//	s.setName("bhanu");
//	s.setCourse("java");
//	s.setEmail("bhanugoud2001gmail.com");	
//	r.savestudent(s);
	
//	student s=new student();
//	s.setId(3);
//	s.setName("prak2ash");
//	s.setCourse("jd2bc");
//	s.setEmail("prak3ash@gmail.com");
//	System.out.println(r.savestudent(s));
	
//	student s=new student();
//	s.setId(4);
//	s.setName("pra222ash");
//	s.setCourse("jd2bc");
//	s.setEmail("prak3ash@gmail.com");
//	System.out.println(r.updatestudentbyid(s));
//	
	
//	student s=new student();
//	System.out.println(r.deletestudentbyid(3));
	
//	student s=new student();
//	s.setId(1);
//	System.out.println(r.getstudentbyid(3));
	
	student s=new student();
	List<student> l= r.getstudentdetails();
	for(student n:l)
	{
		System.out.println(n);
	}
	
	
	
	
	
	
 }
}
