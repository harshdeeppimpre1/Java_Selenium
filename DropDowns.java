package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropDowns {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.id("country"));
		
		Select countries=new Select (country);
		
		//countries.selectByValue("germany");
		
		countries.selectByIndex(5);
		
		List <WebElement>options=countries.getOptions();
		
		System.out.println(options.size());
		
		//countries.selectByVisibleText("Canada");
		
		//printing the options
		
		for (int i=0;i<options.size();i++) {
			
		  System.out.println(options.get(i).getText());
		}
		
		//------------------------------------------------------------------------------------------------------
	
		
		


	}

}
