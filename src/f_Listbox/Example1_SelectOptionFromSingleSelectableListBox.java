package f_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1_SelectOptionFromSingleSelectableListBox 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		//if tag name is select then its listbox
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s= new Select(month);
		
		//s.selectByVisibleText("Aug");
		//s.selectByValue("7");
		s.selectByIndex(11);
		
		
	}

}
