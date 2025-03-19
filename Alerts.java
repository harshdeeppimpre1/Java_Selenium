package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		/*3 types of alerts
		1)simple alert
		2) confirmation alert
		3)prompt alert
*/
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		//1)normal alert with ok button
		
		driver.findElement(By.id("promptBtn")).click();
		
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept();

		//2) confirmation alert cancel and ok
		
		/*driver.switchTo().alert();
		
		Alert myAlert=driver.switchTo().alert();
				 myAlert.dismiss();*/
		
		//3) prompt alert
		
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("harshdeep");
		
		alert.dismiss();
		
		
	}

}
