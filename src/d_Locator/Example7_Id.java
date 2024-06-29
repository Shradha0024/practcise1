package d_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_Id 
{
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\anasa\\OneDrive\\Desktop\\Selenium Soft\\ID.html");
		
		
		driver.findElement(By.id("1234")).sendKeys("abc");
		
		//when id attribute is duplicate and not present then we can't use it 
		
}

}
