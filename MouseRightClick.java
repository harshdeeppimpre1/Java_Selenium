package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseRightClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/input.html");

		driver.manage().window().maximize();
		
		WebElement RighClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act= new Actions(driver);
		
		act.contextClick(RighClick).build().perform();  //context click(right click)
		
		driver.findElement(By.xpath("//body/ul[@class='context-menu-list context-menu-root']/li[5]/label[1]/input[1]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Something Clickable']")).click();
		
		
		
		
		
		


	}

}
