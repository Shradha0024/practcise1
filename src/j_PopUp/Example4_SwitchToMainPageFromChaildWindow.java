package j_PopUp;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example4_SwitchToMainPageFromChaildWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on new tab from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window id
		Set<String> allIds = driver.getWindowHandles();//main page ID, childpageID stores in collection set
	    ArrayList<String> al=new ArrayList<String>(allIds);//main page ID(0),childpageID(1)
	   // String childWindowID =al.get(1);//childwindowID
	    
		//switch to child window
        driver.switchTo().window(al.get(1));// pass string child window ID 
	
		//click on training link from childwindow
	    driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	    
	   
	    Thread.sleep(2000);
	    
	    
	    //switch to main page
	    driver.switchTo().window(al.get(0));
	    
	    //click onnew window from main page
	    driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	    
	     
	    

	}
	

}
