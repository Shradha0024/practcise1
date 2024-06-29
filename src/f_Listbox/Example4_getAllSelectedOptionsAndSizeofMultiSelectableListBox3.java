package f_Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4_getAllSelectedOptionsAndSizeofMultiSelectableListBox3 
{
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\anasa\\OneDrive\\Desktop\\Selenium Soft\\html files\\Sample6_MultiselectListbox.html");
		
		
		Thread.sleep(2000);
		
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s= new Select(selectcountry);
		
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		List<WebElement> AllSelectedOptions = s.getAllSelectedOptions();
		
        System.out.println(AllSelectedOptions.size());
        
		for(WebElement s1:AllSelectedOptions)
		{
			System.out.println(s1.getText());
		}
}


}
