package com.ebank.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	public ReadConfig()
	{
		File fi=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\loginPage.properties");
		try 
		{
			FileInputStream fis= new FileInputStream(fi);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			
		}	
	}
	
	public  String getLoginURL()
	{
		return pro.getProperty("loginPageUrl"); // from .propertiesFile
	}
	public  String getUserName()
	{
		return pro.getProperty("userID");
	}
	
	public  String getPassword()
	{
		return pro.getProperty("password");
	}
	
	

}
