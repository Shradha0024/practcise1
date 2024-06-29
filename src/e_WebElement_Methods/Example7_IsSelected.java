
package e_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_IsSelected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
	
		boolean result = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("disselectd");
		}
		
		
		
		
	}

}
