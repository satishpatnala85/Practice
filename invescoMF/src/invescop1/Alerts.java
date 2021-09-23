package invescop1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.setProperty("webdriver.chrome.driver","D:\\SWS\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://sitkboltnext.kfintech.com/kboltnext/login.aspx");
	 
	 WebElement sbmitbtn = driver.findElement(By.id("imgSubmit"));
	 
	 sbmitbtn.click();
	 
	 String x = driver.switchTo().alert().getText();
	 
	 System.out.println(x);
	 
	 driver.switchTo().alert().accept();

	}

}
