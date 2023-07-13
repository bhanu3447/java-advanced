package com.bhanu.customerdata.dto;

public class Customer 
{
 private int id;
 private String name;
 private String email;
 private String address;
 private String contact;
 
 
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", contact="
			+ contact + "]";
}
public int getId() {
	return id;
}
public void setId(int i) {
	this.id = i;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
 
 

}
