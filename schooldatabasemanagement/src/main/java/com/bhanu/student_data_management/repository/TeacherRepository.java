package com.bhanu.student_data_management.repository;


import java.sql.Connection;
import java.util.List;

import com.bhanu.student_data_management.dto.Teacher;

public interface TeacherRepository 
{

	
	
	 Teacher TeaherLogin(String email,String password);
	 String saveTeacher(Teacher teacher);
	 Teacher getTeacherById(int id);
	 String deleteTeacher(int id);
	 Teacher updateTeacher(Teacher teacher);
	 List<Teacher> getTeacherBySubject(String subject);
	 List<Teacher> getClassTeacher(String standard);
	 List<Teacher> getTeacherBySal(int sal);
	 List<Teacher> getAllTeacher();

}

