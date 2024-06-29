package h_ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example2_Saveimgesbydiffname 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		
		String RS = RandomString.make(2);
		System.out.println();
		
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	
	File dest=new File("C:\\Users\\anasa\\OneDrive\\Desktop\\Sceenshot\\Image"+RS+".jpg");
	                      
	
	FileHandler.copy(src, dest);
	
	}


}
