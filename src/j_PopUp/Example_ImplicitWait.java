package j_PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ImplicitWait
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on create new acc
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//enter first name
		driver.findElement(By.xpath("//input[@name='Firstname']")).sendKeys("abc");
		
	}

}
