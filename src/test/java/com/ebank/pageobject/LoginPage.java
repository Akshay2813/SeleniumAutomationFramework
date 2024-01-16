package com.ebank.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//input[@id='user-name']
	@FindBy(xpath="//input[@id='user-name']")
	WebElement userName;
	
	//input[@id='password']
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	//input[@id='login-button']
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginButton;
	
	
	@FindBy(xpath="//div[@class='app_logo']")
	WebElement grabTextLoc;
	
	public void enterUserName(String uName)
	{
		userName.sendKeys(uName);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	
	public void enterLogin()
	{
		loginButton.click();
	}
	
	public String grabText()
	{
		return grabTextLoc.getText();
	}
	
	
	
}
