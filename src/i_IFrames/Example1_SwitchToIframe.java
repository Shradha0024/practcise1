package i_IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_SwitchToIframe 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		
		//switch to frame 
		//driver.switchTo().frame("iframeResult"); //Type1.string frame id
		//driver.switchTo().frame("iframeResult");  //Type2. String frame name
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));//Type3.String frame webelement
		//driver.switchTo().frame(0)
		
		//click on ""click me " btn
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}

}
