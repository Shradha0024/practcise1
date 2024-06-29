package q_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_getColumnSize
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/html%20files/Sample5WebTable.html");
		
		
		int colmnsize1 = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		System.out.println(colmnsize1);
		
		int hedrsize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		System.out.println(hedrsize);
	}

}
