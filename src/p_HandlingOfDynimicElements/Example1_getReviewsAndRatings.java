package p_HandlingOfDynimicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getReviewsAndRatings 
{
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("one plus 9r");
		
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		String reviews = driver.findElement(By.xpath("((//div[@class='tUxRFH'])[1]//span)[8]")).getText();
		System.out.println(reviews);
		
        String ratings = driver.findElement(By.xpath("((//div[@class='tUxRFH'])[1]//span)[6]")).getText();
		System.out.println(ratings);
		
	}

}
