package m_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_MouseLeftClick 
{
	public static void main(String[] args) 
	{WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	
		
		WebElement Cart = driver.findElement(By.xpath("//a[text()='Cart']"));
		
		Actions act= new Actions(driver);
		
//		act.moveToElement(Cart).perform();
//		act.click().perform();
		
		//act.moveToElement(Cart).click().perform();
		
		act.click(Cart).perform();
	}
	}


