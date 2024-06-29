package d_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8_classname 
{
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\anasa\\OneDrive\\Desktop\\Selenium Soft\\Classname.html");
		
		driver.findElement(By.className("abc123")).sendKeys("xyz");
		
		////when classname same for multiple element then it perform action on 1st element
		
}

}
