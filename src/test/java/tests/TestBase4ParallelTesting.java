package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase4ParallelTesting{
	public static String url="https://www.seleniumeasy.com/test";
	protected ThreadLocal<RemoteWebDriver> driver=null;
	@BeforeClass
	@Parameters(value= {"browser"})
	public void setup(String browser) throws MalformedURLException
	{
		driver=new ThreadLocal<RemoteWebDriver>();
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("browserName", browser);
		driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps));
		getDriver().navigate().to(url);
	}
	public WebDriver getDriver()
	{
		return driver.get();
	}
	@AfterTest
	public void stopDriver() {
		getDriver().quit();
		driver.remove();
	}

}
