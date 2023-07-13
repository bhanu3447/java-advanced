package com.bhanu.student_data_management.repository;

import java.sql.Connection;

import com.bhanu.student_data_management.dto.Admin;

public interface AdminRepository 
{
 String saveAdmin(Admin admin);
 Admin adminLogin(String adminName,String password);
}
