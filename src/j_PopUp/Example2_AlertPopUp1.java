package j_PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_AlertPopUp1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//enter cut id and submit
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//get text of alert pop up
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		//click on cancle btn on alert pop up
		//driver.switchTo().alert().dismiss();
		
		//click on on "ok" button on alert pop up
		driver.switchTo().alert().accept();
		
		
		//click on ok  button from 2nd alert pop up
		driver.switchTo().alert().accept();
		
	}

}
