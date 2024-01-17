package com.ebank.testcase;

import org.testng.annotations.BeforeMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ebank.utility.ReadConfig;

public class BaseTestClass {
	
	
	ReadConfig readConfigObj= new ReadConfig();
	public String baseURL = readConfigObj.getLoginURL();
	public String userName = readConfigObj.getUserName();
	public String password= readConfigObj.getPassword();
	
	
	public static WebDriver driver;
	public Logger logger;

	
	
	@BeforeClass
	public void setUp() {
		
		logger=LogManager.getLogger(this.getClass());
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe");
		
		driver= new EdgeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	

}
