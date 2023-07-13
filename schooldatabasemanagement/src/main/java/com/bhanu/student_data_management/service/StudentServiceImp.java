package com.bhanu.student_data_management.service;

import java.util.List;

import com.bhanu.student_data_management.dto.Student;
import com.bhanu.student_data_management.repository.StudentRepository;
import com.bhanu.student_data_management.repository.StudentRepositoryimp;
import com.bhanu.student_data_management.util.AES;
import com.bhanu.student_data_management.util.AppConstants;

public class StudentServiceImp implements StudentService
{
	StudentRepository repository;
	{
		repository=new StudentRepositoryimp();
	}

	@Override
	public Student studentLogin(String email, String password) 
	{
		return null;
		
	}

	@Override
	public String saveStudent(Student student) {
		String encEmail=AES.encrypt(student.getEmail(),AppConstants.SECRETKEY);
		String encAddress=AES.encrypt(student.getAddress(), AppConstants.SECRETKEY);
		String encParentContact=AES.encrypt(student.getParentContact(), AppConstants.SECRETKEY);
		String encPassword=AES.encrypt(student.getPassword(),AppConstants.SECRETKEY);
		student.setEmail(encEmail);
		student.setAddress(encAddress);
		student.setParentContact(encParentContact);
		student.setPassword(encPassword);
		return repository.saveStudent(student);
	}

	@Override
	public Student getStudentById(int id) {
		Student student = repository.getStudentById(id);
		String decEmail=AES.decrypt(student.getEmail(),AppConstants.SECRETKEY);
		String decAddress=AES.decrypt(student.getAddress(), AppConstants.SECRETKEY);
		String decParentContact=AES.decrypt(student.getParentContact(), AppConstants.SECRETKEY);
		String decPassword=AES.decrypt(student.getPassword(),AppConstants.SECRETKEY);
		student.setEmail(decEmail);
		student.setAddress(decAddress);
		student.setParentContact(decParentContact);
		student.setPassword(decPassword);
		return student;
	}

	@Override
	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentByStandard(String standard) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentByStandardAndSection(String standard, String section) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentBetweenPercentage(String lower, String high) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getALLStudent() {
		return null;
		
		
	
	}

}
