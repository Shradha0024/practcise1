package f_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4_getSelectedOptionfromSingleSelectableListBox1 
{
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s= new Select(month);
		
//		WebElement selectedoption = s.getFirstSelectedOption();//return address of selected option
//		String text = selectedoption.getText(); //this mwthod return value of string  
//		System.out.println(text);
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println("text");
		
}

}
