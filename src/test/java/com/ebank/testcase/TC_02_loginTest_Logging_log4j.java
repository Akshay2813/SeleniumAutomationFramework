package com.ebank.testcase;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebank.pageobject.LoginPage;

public class TC_02_loginTest_Logging_log4j extends BaseTestClass {

	
	@Test
	void loginTest()
	{
		
		logger.info("=====Entering BaseURL========");
		driver.get(baseURL);
		LoginPage loginPageObject= new LoginPage(driver);
		
		logger.info("=====Entering UserName========");

		loginPageObject.enterUserName(userName);  //coming from BaseTestClass>>ReadConfig.java >>.properties file
		
		logger.info("===== userName entered Sucussfully========");

		logger.info("=====Entering password========");

		loginPageObject.enterPassword(password);
		
		logger.info("===== password entered Sucussfully========");

		
		logger.info("=====Clicking on Login Button========");

		loginPageObject.enterLogin();
		
		Assert.assertEquals("Swag Labs", loginPageObject.grabText());
		
		logger.info("=====SucessFully Logged in========");


	}
}
