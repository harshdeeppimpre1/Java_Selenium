package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBOX {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		// driver.findElement(By.xpath("//input[@id=\"sunday\"]")).click();

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		/*
		 * // for (int i = 0; i < 3; i++) {
		 * 
		 * checkboxes.get(i).click();
		 * 
		 * 
		 * }
		 */

		for (int i = 0; i < 3; i++) {

			checkboxes.get(i).click();

			Thread.sleep(5);

		}

		for (int i = 0; i < 3; i++) { // unselect selected checkboxes
            if (checkboxes.get(i).isSelected()) 
			checkboxes.get(i).click();
		}
	}

}
