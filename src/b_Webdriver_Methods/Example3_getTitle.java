package b_Webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_getTitle // to get title of webpage and return type is string
{
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 
		String title = driver.getTitle();
		System.out.println(title);
	}

}
