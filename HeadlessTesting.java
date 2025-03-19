package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		
		//Advantages: we can do multiple tasks at a time , faster
		//disadvantage:user cannot see the actions on the page/cannot understand flow/functionality 
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless=new");
	
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String actTitle=driver.getTitle();
		
		if (actTitle.equals("Automation Testing Practice")) {
			
			System.out.println("test passed");
		}
		
		else {
			
			System.out.println("test failed");
		}
		
		
		driver.quit();

	}

}
