package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		// 1) find total numbers of rows in table

		int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();// multiple tables

		System.out.println("total size of the elements:" + rows);//

		// 2) find total numbers of columns in a table

		int columns = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();//

		System.out.println("No of columns:" + columns);

		// 3)read the data from all the rows and columns for eg: 5th row and 1st column
		
		Thread.sleep(5000);

		String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();

		System.out.println("name of the book is:" + bookname);

		// 4) read all the data from all the rows and columns .

		for (int r = 2; r <= rows; r++) {

			for (int c = 1; c <= columns; c++) {

				String value = driver
						.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]"))
						
						.getText();
				System.out.println(value);

				
			}
			
		}
	}

}
