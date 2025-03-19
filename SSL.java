package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL {

	public static void main(String[] args) {
		
		ChromeOptions option= new ChromeOptions();
		
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://expired.badssl.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("title of the page"+driver.getTitle());
		
		
		
		
		

	}

}
