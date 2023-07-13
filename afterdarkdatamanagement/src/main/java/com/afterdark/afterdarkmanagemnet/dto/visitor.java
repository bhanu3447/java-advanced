package com.afterdark.afterdarkmanagemnet.dto;

import java.time.LocalDate;
import java.time.LocalTime;

class visitor 
{
 private int id;
 private String name;
 private String contactno;
 private int age;
 private String email;
 private String gender;
 private String visitingtime;
 private String visitingdate;
 private String idprooftype;
 private String idproofnumber;
 private String address;
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
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getVisitingtime() {
	return visitingtime;
}
public void setVisitingtime(String visitingtime) {
	this.visitingtime = visitingtime;
}
public void setVisitingtime() {
	this.visitingtime = LocalDate.now()+"";
}
public String getVisitingdate() {
	return visitingdate;
}
public void setVisitingdate(String visitingdate) {
	this.visitingdate = visitingdate;
}
public void setVisitingdate() {
	this.visitingdate = LocalDate.now()+"";
}
public String getIdprooftype() {
	return idprooftype;
}
public void setIdprooftype(String idprooftype) {
	this.idprooftype = idprooftype;
}
public String getIdproofnumber() {
	return idproofnumber;
}
public void setIdproofnumber(String idproofnumber) {
	this.idproofnumber = idproofnumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 
}