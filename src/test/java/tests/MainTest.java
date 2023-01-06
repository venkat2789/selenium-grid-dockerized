package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.DriverSetup;

public class MainTest {

	private static WebDriver driver;

	@Test(dataProvider = "getBrowser")
	public static void launchGoogle(String browser) throws MalformedURLException {
		driver = new DriverSetup().getRemoteDriver(browser);
		driver.get("https://google.com");
		System.out.println("On browser: " + browser + ", Title: " + driver.getTitle());
		driver.quit();
	}

	@Test(dataProvider = "getBrowser")
	public static void launchFacebook(String browser) throws MalformedURLException {
		driver = new DriverSetup().getRemoteDriver(browser);
		driver.get("https://facebook.com");
		System.out.println("On browser: " + browser + ", Title: " + driver.getTitle());
		driver.quit();
	}

	@DataProvider(parallel = true)
	public Object[] getBrowser() {
		return new Object[] { "chrome", "firefox" };
	}

}
