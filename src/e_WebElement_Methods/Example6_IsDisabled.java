package e_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_IsDisabled 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")).isEnabled();
		
		System.out.println(result);
		
		if(result)
		{
			System.out.println("element is enabled");
		}
		else
		{
			System.out.println("elemnt is disabled");
		}
	}

}
