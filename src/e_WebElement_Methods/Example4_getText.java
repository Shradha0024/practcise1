package e_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_getText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		System.out.println(text);
	
	}
}
