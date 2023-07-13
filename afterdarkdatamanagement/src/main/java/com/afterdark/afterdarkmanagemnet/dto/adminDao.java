package com.afterdark.afterdarkmanagemnet.dto;

public interface adminDao
{
  String saveadmin(admin a);
  admin adminlogin(String username,String password);
  
}
