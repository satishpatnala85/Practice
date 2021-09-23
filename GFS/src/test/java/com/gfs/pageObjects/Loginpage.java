package com.gfs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="email")
	public WebElement txtUsername;
	
	@FindBy(name="pass")
	public WebElement txtPassword;
	
	
	@FindBy(name="login")
	public WebElement btnsubmit;
	
	public void setUserName(String uname)
	{
		txtUsername.sendKeys(uname);
		
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		btnsubmit.click();
	}
	
}
