package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//1)scroll down page by pixel number
		
		//js.executeScript("window.scrollBy(0,3000)", "");
		
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//2) scroll the page until element is visible
		
		WebElement element =driver.findElement(By.xpath("//a[text()='merrymoonmary']"));
		
		js.executeScript("arguments[0].scrollIntoView();",element );
		
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//3)scroll page till end of the document.
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)" );
		
        // System.out.println(js.executeScript("return window.pageYOffset;"));
        
        //4)Scrolling up to initial position
        
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)" );
		
		


		
		
		
		
		
		
		


	}

}
