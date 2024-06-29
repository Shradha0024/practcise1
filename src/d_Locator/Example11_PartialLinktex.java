package d_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example11_PartialLinktex 
{
	public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\anasa\\OneDrive\\Desktop\\Selenium Soft\\linktest_partialLinktest.html");
		
		driver.findElement(By.partialLinkText("book")).click();
		
	}

}
