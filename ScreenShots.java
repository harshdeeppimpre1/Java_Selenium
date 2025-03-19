package Selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots {

	public static void main(String[] args) {
		
		//fullpage
		//specific area 
		//webElement
		
		//fullpage
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		//TakesScreenshot ts=(TakesScreenshot)driver;
		
		//File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		//File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		
		//sourcefile.renameTo(targetfile); //copy source file to target file
		
		// taking screenshot of particular section
		
		//WebElement section= driver.findElement(By.xpath("//body"));
		
	   // File source=section.getScreenshotAs(OutputType.FILE);
	    
	   // File target= new File(System.getProperty("user.dir")+"\\Screenshots\\target.png");
	    
	  //  source.renameTo(target);
	    
	    //capture the screenshot of webelement
	    
	    WebElement title=driver.findElement(By.xpath("//h1[@class='title']"));
	    
	    File source=title.getScreenshotAs(OutputType.FILE);
	    
	    File target= new File (System.getProperty("user.dir")+"\\Screenshots\\title.png");
	    
	    source.renameTo(target);
	    
	    
		
		
		
		
		
		
		
		
		
		
		

	}

}
