package d_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_Tagname 
{
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\anasa\\OneDrive\\Desktop\\Selenium Soft\\Tagname.html");
		
		driver.findElement(By.tagName("input")).sendKeys("abc");
		
		//when tagneme same for multiple element then it perform action on 1st element
		//driver.findElement(By.tagName("input")).sendKeys("pqr");
	}

}
