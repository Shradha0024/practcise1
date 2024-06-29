package l_HandlingOfAutoSugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("samsung wshing machine");
		
		Thread.sleep(2000);
		
		List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		String expecttext="samsung washing machine 7kg";
		
		Thread.sleep(2000);
		
		for( WebElement s1:alloptions)
		{
			String actualtext=s1.getText();
			if(actualtext.equals(expecttext))
			{
				s1.click();
				break;
			}
		}
	}

}
