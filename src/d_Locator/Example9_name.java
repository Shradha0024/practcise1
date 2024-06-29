package d_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example9_name 
{
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\anasa\\OneDrive\\Desktop\\Selenium Soft\\name.html");
		
		driver.findElement(By.name("xyz123")).sendKeys("xyz");
		
		////when name attribute same for multiple element then program fail
}
}
