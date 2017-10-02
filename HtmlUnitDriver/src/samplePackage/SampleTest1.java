package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class SampleTest1 {

	@Test(invocationCount = 10000)
public void test1(){
	
		WebDriver driver = new HtmlUnitDriver();
		driver.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/07/take-ScreenShot-failed-test-case-ITestListener-Interface.html");
		driver.close();
		
		WebDriver driver1 = new HtmlUnitDriver();
	    driver1.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/07/ITestContext-testng-Selenium.html");
		driver1.close();
		
		WebDriver driver2 = new HtmlUnitDriver();
		driver2.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/07/testng.xml.html");
		driver2.close();

		WebDriver driver3 = new HtmlUnitDriver();
		driver3.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/07/take-screenshot-failed-test-case-only.html");
		driver3.close();

		WebDriver driver4 = new HtmlUnitDriver();
		driver4.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/07/Data-Driven-test-suite-TestNG-framework.html");
		driver4.close();
		
		WebDriver driver5 = new HtmlUnitDriver();
		driver5.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/07/Execute-multiple-classes-testng.xml.html");
		driver5.close();
		
		WebDriver driver6 = new HtmlUnitDriver();
		driver6.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2016/10/introduction-to-software-testing.html");
		driver6.close();

	}

}
