package m_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_MoveToElement 
{
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			
			//step1:idenfiy element
			WebElement BeautyToys = driver.findElement(By.xpath("//span[text()='Beauty, Toys & More']"));
			
			//step2:create object of action class
			Actions act= new Actions(driver); //to perform mouse related action call action class method
			
			//step3:move to element
			act.moveToElement(BeautyToys).perform();
		}
		
	}


