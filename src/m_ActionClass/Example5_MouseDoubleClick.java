package m_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example5_MouseDoubleClick 
{
	public static void main(String[] args) 
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com//test/simple_context_menu.html");
			
			WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			
			Actions act= new Actions(driver);
			
			act.doubleClick().perform();
			
		
	}

}
