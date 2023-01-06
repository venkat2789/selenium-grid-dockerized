package config;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverSetup {

	public WebDriver getLocalDriver() {
		SeleniumManager.getInstance();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		return driver;
	}

	public WebDriver getRemoteDriver(String browser) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);

		return driver;
	}

}
