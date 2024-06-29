package m_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example6_DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com//test/drag_drop.html");
		
		Thread.sleep(2000);
		
		WebElement srcele = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destele = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));


		Actions act=new Actions(driver);

		act.dragAndDrop(srcele, destele).perform();
		
		//act.moveToElement(srcele).clickAndHold().moveToElement(destele).release().perform();
	}

}
