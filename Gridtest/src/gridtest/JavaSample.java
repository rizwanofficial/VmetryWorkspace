package gridtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class JavaSample {

	public static final String USERNAME = "jayasudhan1";
	public static final String AUTOMATE_KEY = "bdmcLY7tp3pYXxKgtgV9";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		/*
		 * caps.setCapability("browser", "IE");
		 * caps.setCapability("browser_version", "7.0");
		 * caps.setCapability("os", "Windows"); caps.setCapability("os_version",
		 * "XP"); caps.setCapability("browserstack.debug", "true");
		 */

		caps.setCapability("device", "Samsung Galaxy S8 Plus");
		caps.setCapability("realMobile", "true");
		caps.setCapability("os_version", "7.0");
		caps.setCapability("browserstack.debug", "true");// this should be
															// altered for
															// different device
		caps.setCapability("browserstack.local", "true");
		caps.setCapability("browserstack.localIdentifier", "Test123");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("BrowserStack");
		element.submit();

		System.out.println(driver.getTitle());
		driver.quit();

	}
}