package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * get()-opens the url on the browser gettitle()-returns the title of the
		 * Web page getCurrentURL()- returns the current url of the webpage
		 * getPageSouce()-returns source code of the page getwindowhandle()-returns
		 * window id of the single browser window getWindowHandles()- returns the value
		 * of the multiple browser window
		 * 
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		// System.out.println("current url of the page is:" + driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		System.out.println("title of the page is:" + driver.getTitle());

		// String windowid = driver.getWindowHandle();
		// System.out.println("window id:" + windowid);

		// conditional statements: returns boolean
		// is enabled()
		// is selected()
		// is displayed()

		// browser methods
		// close- closes current browser window
		// quit- close all the browser windows.

		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();

		Thread.sleep(5);

		// driver.close();

		/*
		 * driver.quit();
		 * 
		 * driver.get("https://testautomationpractice.blogspot.com/");
		 * 
		 * driver.navigate().to("https://testautomationpractice.blogspot.com/");
		 * 
		 * driver.navigate().back(); *****navigation commands*****
		 * 
		 * driver.navigate().forward();
		 * 
		 * driver.navigate().refresh();
		 */
	}

}
