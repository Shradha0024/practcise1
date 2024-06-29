package q_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_getDataFromTable 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/anasa/OneDrive/Desktop/Selenium%20Soft/html%20files/Sample5WebTable.html");
		
		
		String data = driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td[3]")).getText();
		System.out.println(data);
		
		String hedrdata = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
		System.out.println(hedrdata);
		
	}


}
