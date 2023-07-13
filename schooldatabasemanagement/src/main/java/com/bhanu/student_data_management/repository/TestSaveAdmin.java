package com.bhanu.student_data_management.repository;

import com.bhanu.student_data_management.dto.Admin;

public class TestSaveAdmin
{
 public static void main(String[] args) 
 {

	 
//	 Admin admin = new Admin();
//	 admin.setAdminName("bh2akkk");
//	 admin.setPassword("34348987");;
//	 AdminRepository ad = new AdminRepositoryImp();
//	 System.out.println(ad.saveAdmin(admin));
	 
	 
	 
	 AdminRepository ar  = new AdminRepositoryImp();
	 Admin adminLogin = ar.adminLogin("bhanu", "3447");
     if(adminLogin!=null)
     {
    	 System.out.println(adminLogin.getAdminName());
     }
     else
     {
    	 System.out.println("invalid user or password");
      }
   }
}