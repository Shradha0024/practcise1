package d_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_XpathByContainsUsingAttribute 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("abc");
		
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2]")).sendKeys("1234");
		
		driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _6lth _')]")).click();
	}

}
