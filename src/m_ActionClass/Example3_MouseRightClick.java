package m_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_MouseRightClick 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com//test/simple_context_menu.html");
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act= new Actions(driver);
		
		act.contextClick(rightclick).perform();
		
//		act.moveToElement(rightclick).contextClick().perform();
		              //or
//		act.moveToElement(rightclick).perform();
//		act.contextClick().perform();
	}

}
