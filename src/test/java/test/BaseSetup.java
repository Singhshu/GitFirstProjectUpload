package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseSetup {
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setup() {
		extent = new ExtentReports();
		reporter= new ExtentSparkReporter("report.html");
		extent.attachReporter(reporter);
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush();		
	}

}
