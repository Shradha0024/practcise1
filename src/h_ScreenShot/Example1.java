package h_ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example1 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(src);
		
		File dest= new File("C:\\Users\\anasa\\OneDrive\\Desktop\\Sceenshot\\xyz.jpg");
		
		FileHandler.copy(src, dest);
		
		//click on create new acc
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest1= new File("C:\\Users\\anasa\\OneDrive\\Desktop\\Sceenshot\\xyz1.jpg");		
		FileHandler.copy(src1, dest1);
		
		
		
	}
	

}
