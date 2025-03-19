package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
		
	
		Set<String> WindowID=driver.getWindowHandles();
		
		Thread.sleep(5);
		
		/*Approach 1
		
		List <String> WindowList= new ArrayList(WindowID);
		
		String ParentID=WindowList.get(0);
		
		String ChildID=WindowList.get(1);
		
		driver.switchTo().window(ParentID);
		
		System.out.println(driver.getCurrentUrl());
		*/
		
		//Approach 2
		
		
		for (String winID:WindowID) {
			
			String title=driver.switchTo().window(winID).getTitle();
			
			if(title.equals("https://testautomationpractice.blogspot.com/"))  
			{
				
				driver.close();
			}
			
			
			
			
		}
		
		
		
		

	}

}
