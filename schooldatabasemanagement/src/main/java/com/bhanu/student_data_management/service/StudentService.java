package com.bhanu.student_data_management.service;

import java.util.List;

import com.bhanu.student_data_management.dto.Student;



public interface StudentService
{
	 Student studentLogin(String email,String password);
	 String saveStudent(Student student);
	 Student getStudentById(int id);
	 String deleteStudentById(int id);
	 Student updateStudent(Student student);
	 List<Student> getStudentByStandard(String standard);
	 List<Student> getStudentByStandardAndSection(String standard,String section);
	 List<Student> getStudentBetweenPercentage(String lower,String high);
	 List<Student> getALLStudent();
}
