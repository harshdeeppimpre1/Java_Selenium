package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		WebElement Min_Slider=driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));
		
		System.out.println("Location of min slider:"+Min_Slider.getLocation());
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(Min_Slider, 1000, 1968).perform();
		
		System.out.println("location of the slider after drag and drop:"+ Min_Slider.getLocation());// drag and drop
		
	    WebElement maxSlider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-focus']"));
	    
	    Actions act1= new Actions(driver);
	    
	    System.out.println("max salider location is:"+maxSlider);
	    
	    
	    
	    
		

	}

}
