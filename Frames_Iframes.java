package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Iframes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://ui.vision/demo/webtest/frames/");

		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("harshdeep");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("pimpre");
		
		driver.switchTo().defaultContent();
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("gautam");


	}

}
