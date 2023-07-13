package com.bhanu.student_data_management.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil
{
  public static Connection getConnection()
  {
	  try 
		{
			Class.forName(AppConstants.DRIVERNAME);
			String url = AppConstants.DB_URL;
			String user = AppConstants.DB_USERNAME;
			String password = AppConstants.DB_PASSWORD;

			return DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return null;

  }
}
