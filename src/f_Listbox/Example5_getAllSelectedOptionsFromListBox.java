package f_Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example5_getAllSelectedOptionsFromListBox //list box may be any single or multi selectabe it will print all
{
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s= new Select(month);
		
		List<WebElement> alloptions = s.getOptions();
		//System.out.println(alloptions.size());
		int size= s.getOptions().size();
		System.out.println(size);
		
		for(WebElement s1:alloptions)
		{
			System.out.println(s1.getText());
		}
}

private static char[] size() {
	// TODO Auto-generated method stub
	return null;
}

}
