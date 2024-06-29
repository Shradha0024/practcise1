package f_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2_DeSelectOptionFromMultiSelectableListBox1 

{
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\Users\\anasa\\OneDrive\\Desktop\\Selenium Soft\\html files\\Sample6_MultiselectListbox.html");
	

	
	WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
	
	Select s= new Select(selectcountry);
	
	s.selectByIndex(0);
	s.selectByIndex(1);
	s.selectByIndex(2);
	
	Thread.sleep(2000);
	

	//s.deselectByIndex(1);
	
	//s.deselectByVisibleText("PAK");
	
	s.deselectAll();
	}
	
}
	
