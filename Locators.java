package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		
		//id - single element          
		//name - single element 
		//linktext -<a href  - single element 
		//partail link text-<a href- single element 
		
		
		//Tagname- multiple elements
		//classname-multiple elements
		
		//x path is an address of the element 
		//DOM-document object model.
		//a)absolute x path- starts with double slash-traverse through each node-dont use attributes.
		//b)relative x path-single slash-directly jump -uses attribute.
		
		// single attribute  -  //tagname[@attribute='value']
		// multiple attribute- 'and', 'or'     //tagnmae [@attribute='value' and/or @attribute='value']
		//text method =//tagname[text()='value']
		//contains= //tagname[contains(@attribute,'value')]
		//chained xpath =//tagname(@attribute='value']/tagname/-/-/
		
		/*x path axes
		1)child-  xpath/child::element name  or 
		2)parent-  xpath/parent::element name    or xpath/parent::element::*
		3)preceding-sibling- xpath/preceding::element name
		4)following-sibling-xpath/following::element name
		5)Ancestor-xpath/Ancestor::element name
		6)descendant- xpath/descendant::element name
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}