package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStack {

  public static final String USERNAME = "prakashnarkhede1";
  public static final String AUTOMATE_KEY = "ory9DpjpK4ezq7om7pAX";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  @Test(invocationCount = 1000)
	public void test() throws MalformedURLException{
  DesiredCapabilities caps = new DesiredCapabilities().firefox();
  caps.setPlatform(Platform.ANY);
  caps.setBrowserName(BrowserType.EDGE);
  WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
  driver.get("http://testautomator.in/");
  driver.quit();

}
}