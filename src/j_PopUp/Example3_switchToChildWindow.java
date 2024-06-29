package j_PopUp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_switchToChildWindow 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on "NewTab" from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window id
		Set<String> allIDs= driver.getWindowHandles(); // to get all ids of page,main page ID, childpageID stores in collection set
		ArrayList<String> al=new ArrayList<String>(allIDs);//pass all id object to ArrayList<String> to get index of ids,main page ID(0),childpageID(1)
		String childwindowID = al.get(1);// store index of childwindow id(1) in object
		//System.out.println(childwindowID);
		
		
		//switch to child window
		driver.switchTo().window(childwindowID);
		
		//CLICK ON Training window
		driver.findElement(By.xpath("(//span[text()='Training'][1])")).click();
		
		
	}

}
