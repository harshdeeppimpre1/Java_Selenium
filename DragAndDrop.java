package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		WebElement target=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		act.dragAndDrop(source, target).build().perform();  //drag and drop
		
		
		//diff between actions and action
		
		//1) Actions= is a class whilch helps to perform mouse actions
		//2) Action = is a interface which helps to store the created action


	}

}
