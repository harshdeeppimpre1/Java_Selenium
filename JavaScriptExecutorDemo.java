package Selenium;

import java.lang.classfile.instruction.DiscontinuedInstruction.JsrInstruction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		
		// only click and send keys.
		// java script executor is a interface.
		//element intercepted exception.
		//ExecuteScripts()- we can execute javascript elements.
		
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
        WebElement inputbox=driver.findElement(By.xpath("//input[@id=\"name\"]"));
        
        JavascriptExecutor js= (JavascriptExecutor)driver;
        
        //alternate of sendkeys method

        js.executeScript("arguments[0].setAttribute('value','john')",inputbox);
        
        WebElement RadioButton=driver.findElement(By.xpath("//input[@id=\"male\"]"));
        
        //alternate of click method
        
        js.executeScript("arguments[0].click()",RadioButton);
        
        // scrolling the page
        
       
        
        
        
        
        
		
		

	}

}
