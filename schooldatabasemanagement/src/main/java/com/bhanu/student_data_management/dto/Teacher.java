package com.bhanu.student_data_management.dto;

public class Teacher 
{
 private int id;
 private String name;
 private String email;
 private String contact;
 private String subject;
 private String classteacher;
 private int salary;
 private String address;
 private String password;
 
 @Override
public String toString() {
	return "Teacher [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", subject=" + subject
			+ ", classteacher=" + classteacher + ", salary=" + salary + ", address=" + address + ", password="
			+ password + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getClassteacher() {
	return classteacher;
}
public void setClassteacher(String classteacher) {
	this.classteacher = classteacher;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
