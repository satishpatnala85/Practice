package com.gfs.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {

	public String baseURL = "www.facebook.com";
	public String username = "9493470300";
	public String password = "amrutha@123";
	public static WebDriver driver;


@BeforeClass
 public void setUp()
 {
	System.setProperty("webdriver.chrome.driver","D:\\seleniumpractice\\GFS\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
 }

@AfterClass
 public void tearDown()
 {
    driver.quit();
}
 
}