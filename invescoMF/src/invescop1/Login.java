package invescop1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\SWS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:facebook.com");
		driver.quit();

	}

}
