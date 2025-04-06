package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;

import pages.MainPage;
import reporting.ExtentReporterNG;

public class BaseTests {

	protected WebDriver driver;
	protected MainPage mainPage;
	protected ExtentReports extent;
	
	@BeforeClass
	public void setUp() {
		ExtentReporterNG xr = new ExtentReporterNG();
		extent = xr.getReporterObject();
		extent.createTest("MainTest");
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		goHome();
		mainPage = new MainPage(driver);
	}
	
	@BeforeMethod
	public void goHome() {
		driver.get("https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html");
	}
	
	@AfterClass
	public void ShutDown() throws InterruptedException {
		extent.flush();
		Thread.sleep(6000);
		driver.quit();
	}	
}
