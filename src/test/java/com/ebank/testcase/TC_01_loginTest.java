package com.ebank.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebank.pageobject.LoginPage;

public class TC_01_loginTest extends BaseTestClass {

	@Test
	void loginTest()
	{
		driver.get(baseURL);
		LoginPage loginPageObject= new LoginPage(driver);
		
		loginPageObject.enterUserName(userName);  //coming from BaseTestClass>>ReadConfig.java >>.properties file
		loginPageObject.enterPassword(password);
		loginPageObject.enterLogin();
		
		Assert.assertEquals("Swag Labs", loginPageObject.grabText());

	}
}
