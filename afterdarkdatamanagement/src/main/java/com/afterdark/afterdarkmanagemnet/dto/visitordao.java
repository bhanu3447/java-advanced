package com.afterdark.afterdarkmanagemnet.dto;

import java.util.List;

public interface visitordao
{
  public visitor savevisitordetails(visitor v);
  public visitor getvisitorbyid(int id);
  public visitor getvisitorbyemail(String email);
  public visitor getvisitorbycontact(String contactno);
  public visitor getvisitorbyidproofnumber(String idpoofnumber);
  List<visitor> getvisitordetailsbydate(String date);
  public visitor updatevisitor(visitor v);
  public visitor deltevisitorbyid(int id);
  public visitor deltevisitorbyemail(String email);
  public visitor deltevisitorbycontactno(String contact);
  public String deleteall();
  public visitor updatevisitorname(int id,String name);
  public List<visitor> getallvisitordata();
  public List<visitor> getvisitordatabydate();
  
  
  
  
}
