package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadingFiles {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("singleFileInput")).sendKeys("\"C:\\Users\\harsh\\OneDrive\\Documents\\OOPs.docx\"");
		
		//uploading multiple files.
		
		//String file1="C:\Users\harsh\OneDrive\Documents\OOPs.docx";
		//String file2="C:\Users\harsh\OneDrive\Documents\Selenium.docx";
		
		//driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).sendKeys(file1+"\n"+file2);
		
		


	}

}
