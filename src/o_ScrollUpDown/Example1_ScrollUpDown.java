package o_ScrollUpDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_ScrollUpDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Scroll down : 1st parameter 0, 2nd parameter +ve pixel value
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		
		//Scroll Up : 1st parameter 0, 2nd parameter -ve pixel value
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-200)");
		
	}

}
