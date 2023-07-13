package com.bhanu.student_data_management.dto;

public class Student 
{
	 private int id;
	 private String name;
	 private String email;
	 private String standard;
	 private String section;
	 private String parentContact;
	 private String password;
	 private String overallPercentage;
	 private String gender;
	 private String remarks;
	 private String address;
	 
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName()
	{
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
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getParentContact() {
		return parentContact;
	}
	public void setParentContact(String parentContact) {
		this.parentContact = parentContact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOverallPercentage() {
		return overallPercentage;
	}
	public void setOverallPercentage(String overallPercentage) {
		this.overallPercentage = overallPercentage;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", standard=" + standard + ", section="
				+ section + ", parentContact=" + parentContact + ", password=" + password + ", overallPercentage="
				+ overallPercentage + ", gender=" + gender + ", remarks=" + remarks + ", address=" + address + "]";
	}
	 
	 
}
