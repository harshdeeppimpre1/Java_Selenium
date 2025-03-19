package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		//switch to frame
		
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(5000);
		
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2=driver.findElement(By.xpath("//input[@id='field2'])"));
		WebElement button=driver.findElement(By.xpath("//input[normalize-space()='Copy Text']"));
		
		box1.clear();
		
		box1.sendKeys("harshdeep");
		
		Actions act= new Actions(driver);
		
		act.doubleClick().build().perform();

		
	}

}
