package invescop1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EIBLogin {
	
	public WebDriver launchSite(String launchurl)
	{
        WebDriver driver = new ChromeDriver();
		
		driver.get(launchurl);
		
		return driver;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","D:\\SWS\\chromedriver.exe");
		
		EIBLogin eib = new EIBLogin();
		
		WebDriver driver = eib.launchSite("https://sitkboltnext.kfintech.com/kboltnext/");
		
		
		
		WebElement uid = driver.findElement(By.id("txtLoginId"));
		
		uid.sendKeys("74059");
		
		WebElement pwd = driver.findElement(By.id("txtPassword"));
		
		pwd.sendKeys("July@2021");
		
		WebElement fund = driver.findElement(By.id("selFund"));
		
		Select s = new Select(fund);
		
		s.selectByVisibleText("EIB");
		
		WebElement login = driver.findElement(By.id("imgSubmit"));
		
		login.click();
		
		
		//EIBLogin login = new EIBLogin();
		
		//login.launchSite();

	}

}
