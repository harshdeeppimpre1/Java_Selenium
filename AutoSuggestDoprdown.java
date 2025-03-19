package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDoprdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("Selenium");

		List<WebElement> options = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li//div[@role=\"option\"]"));

		System.out.println(options.size());

		for (int i = 0; i < options.size(); i++) {

			System.out.println(options.get(i).getText());

			if (options.get(i).getText().equals("Selenium")) {

				options.get(i).click();

				break;
				
				//try bjs dropdown 

			}
		}

	}

}
