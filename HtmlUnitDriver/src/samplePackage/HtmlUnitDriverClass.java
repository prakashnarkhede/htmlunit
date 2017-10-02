package samplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.BrowserType;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitDriverClass {

	public static void main(String[] args) {

		//initialize HtmlUnitDriver wit variable driver.
		WebDriver driver = new HtmlUnitDriver();
		
		driver.navigate().to("https://learnaboutsoftwaretesting.blogspot.in");
		
		System.out.println("Title of the page is: "+driver.getTitle());
		
	}

}
