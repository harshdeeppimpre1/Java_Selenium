package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboadActions {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://text-compare.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@class=\"inputText\" and @id=\"inputText1\"]")).sendKeys("Welcome");

		Actions act = new Actions(driver);

		// cntr A

		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

		// cntrl c
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		// tab

		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

		// cntr v
		act.keyDown(Keys.TAB).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}
