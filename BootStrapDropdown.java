package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//select single option
		
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all the options and find out size
		
		List <WebElement> options=driver.findElements(By.xpath("//ul//label"));
		
		System.out.println(options.size());
		
		//printing options 
		
		for (WebElement op:options) {
			
			System.out.println(op.getText());
		}


	}

}
