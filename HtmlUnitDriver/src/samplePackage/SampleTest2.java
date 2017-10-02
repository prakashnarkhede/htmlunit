package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class SampleTest2 {

	@Test(invocationCount = 100)
public void test1(){
	
		WebDriver driver = new HtmlUnitDriver();
		driver.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/06/take-Screenshot-entire-page-Selenium-WebDriver.html");
		driver.close();

	}

}
