package invescop1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","D:\\\\SWS\\\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(5000);
	
	WebElement e1 = driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']"));
	
	e1.sendKeys("9866433348");
	
	WebElement e2 = driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']"));
	
	e2.sendKeys("amrutha@123");
	
	Thread.sleep(10000);
	
	WebElement e3 = driver.findElement(By.xpath("//*[@type='submit']"));
	
	e3.click();
	
	WebElement e4 = driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']"));
	
	e4.click();
	
	WebElement e5 = driver.findElement(By.xpath("//*[@class='_3704LK']"));
	
	e5.sendKeys("Mobiles");
	
	e5.sendKeys(Keys.ENTER);
	
	List<WebElement> l1 = driver.findElements(By.xpath("//*[@value='Mobiles']"));
	
	int x = l1.size();
	
	System.out.println(x);
	
	
	
	
	
	

	}

}
