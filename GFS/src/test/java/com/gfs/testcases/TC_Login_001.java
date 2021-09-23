package com.gfs.testcases;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.gfs.pageObjects.Loginpage;



public class TC_Login_001 extends Baseclass
{
    @Test
	public void loginTest()
	{
		driver.get(baseURL);
		
		Loginpage lp = new Loginpage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clicklogin();
		
		if(driver.getTitle().equals("Facebook"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	 
}
