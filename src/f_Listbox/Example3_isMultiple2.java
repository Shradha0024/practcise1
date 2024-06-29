package f_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3_isMultiple2 {

	
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\anasa\\OneDrive\\Desktop\\Selenium Soft\\html files\\Sample6_MultiselectListbox.html");
		
		
		Thread.sleep(2000);
		
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s= new Select(selectcountry);
		
        boolean result = s.isMultiple();
		
		if(result)
		{
			System.out.println("listbox is singleselectable");
		}
		else
		{
			System.out.println("listbox is multiselectable");
		}
}
}
