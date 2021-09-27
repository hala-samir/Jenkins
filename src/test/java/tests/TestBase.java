/*package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver;
	@BeforeSuite
	public void startDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers3/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.seleniumeasy.com/test");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
	@AfterSuite
	private void tearDown() {
		driver.quit();
	}

}
*/