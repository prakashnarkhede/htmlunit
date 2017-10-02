package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class SampleTest {

	@Test(invocationCount = 10)
public void test1(){
	
		WebDriver driver = new HtmlUnitDriver();
		driver.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/07/take-ScreenShot-failed-test-case-ITestListener-Interface.html");
		driver.close();
/*		driver.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/07/ITestContext-testng-Selenium.html");
		driver.close();
		driver.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/07/testng.xml.html");
		driver.close();
		driver.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/07/take-screenshot-failed-test-case-only.html");
		driver.close();
		driver.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/07/Data-Driven-test-suite-TestNG-framework.html");
		driver.close();
		driver.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2017/07/Execute-multiple-classes-testng.xml.html");
		driver.close();
		driver.navigate().to("https://learnaboutsoftwaretesting.blogspot.in/2016/10/introduction-to-software-testing.html");
		driver.close();*/

	}

}
