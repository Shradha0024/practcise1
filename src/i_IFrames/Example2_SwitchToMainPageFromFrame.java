package i_IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_SwitchToMainPageFromFrame 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		
		//switch to frame 
		driver.switchTo().frame("iframeResult"); 
		
		
		//click on ""click me " btn
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 
		 //Switch to main page
		 driver.switchTo().parentFrame();// Type1
		 //driver.switchTo().defaultContent();// Type2
		 
		 //click on open menu option from main page
		driver.findElement(By.xpath("//a[@onclick='openMenu()']")).click();
	}

}
