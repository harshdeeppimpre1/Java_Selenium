package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
        WebElement pointme= driver.findElement(By.xpath("//button[@class=\"dropbtn\"]"));
        
        WebElement mobiles=driver.findElement(By.xpath("//a[text()='Mobiles']"));
        
        Actions act= new Actions(driver);
        
        act.moveToElement(pointme).moveToElement(mobiles).click().build().perform();  //mouse hover
        
        
        
        
        
        
	

	}

}
