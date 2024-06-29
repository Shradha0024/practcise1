package k_HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_SelectMultipleCheckBoxesAndDeselectInReverseOrder 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\anasa\\OneDrive\\Desktop\\Selenium Soft\\html files\\Multiplecheckboxex1.html");
		
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(checkBoxes.size());
		
		// to select all checkboxes
		for(WebElement s1:checkBoxes) 
		{
			s1.click();
			Thread.sleep(2000);
		}
		
		// deselect all checkboxes in reverse order
		for(int i=checkBoxes.size()-1; i>=0; i--)
		{
			checkBoxes.get(i).click();
			Thread.sleep(500);
		}
		
		
	}

}
