package invescop1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\\\SWS\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(5000);
		
		//Number of items in the dropdown
		
		WebElement e1 = driver.findElement(By.id("gh-cat"));
		
		Select s = new Select(e1);
		
		int a = s.getOptions().size();
		
		System.out.println(a);
		
		
		//To print the text of the drop down items
		
		List<WebElement> l1 = driver.findElements(By.tagName("select"));
		
		
		System.out.println(l1.size());
		
		for(int i=0;i<l1.size();i++)
		{
		   String x =l1.get(i).getText();
		   
		   System.out.println(x);
		   
		
		   
		   /*if(l1.get(i).getText().equals("Music"))
			   
		   {
		   	 System.out.println("Item found");
			   
		   }
		   else
		   {
			   System.out.println("Item not found");
		   }*/
		}
		
	}

}
