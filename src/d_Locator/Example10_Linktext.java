package d_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example10_Linktext 
{
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\anasa\\OneDrive\\Desktop\\Selenium Soft\\linktest_partialLinktest.html");
		
		driver.findElement(By.linkText("facebook")).click();
		
		////when name attribute same for multiple element then program fail
}

}
