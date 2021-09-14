package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
/*import com.aventstack.extentreports.reporter.ExtentHtmlReporter;*/
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class NewTest {

	/* public static ExtentHtmlReporter htmlReporter; */
	public ExtentReports extent;
	public ExtentTest extentTest;
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		/*
		 * htmlReporter= new ExtentHtmlReporter("./reports/extent.html");
		 * htmlReporter.config().setDocumentTitle("Automation Reports");
		 * htmlReporter.config().setReportName("Automation Test Results");
		 * htmlReporter.config().setTheme(Theme.STANDARD);
		 * 
		 * extent = new ExtentReports(); extent.setSystemInfo("Organization", "Test");
		 * extent.setSystemInfo("Browser", "Chrome");
		 * extent.attachReporter(htmlReporter);
		 */
		/*
		 * htmlReporter= new ExtentHtmlReporter("./Reports/extent.html"); extent = new
		 * ExtentReports(); extent.attachReporter(htmlReporter);
		 * extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
		 * extent.setSystemInfo("Environment", "Automation Testing");
		 * extent.setSystemInfo("User Name", "Shubham Pal Singh");
		 * 
		 * htmlReporter.config().setDocumentTitle("Title of the Report Comes here");
		 * htmlReporter.config().setReportName("Name of the Report Comes here");
		 * htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		 * htmlReporter.config().setTheme(Theme.STANDARD);
		 */
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}


	@Test
	public void testSuccessfull() {
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0");
		extentTest=extent.createTest("Sucessfull Test");
		extentTest.log(Status.PASS, "Test Method Successfull");
	}
	
	@Test
	public void testFailed() {
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0");
		extentTest=extent.createTest("Sucessfull Test");
		extentTest.log(Status.FAIL, "Test Method Failed");
		AssertJUnit.fail("executing Failed Test Method");
	}
	
	@Test
	public void testSkipped() {
		extentTest=extent.createTest("Sucessfull Test");
		extentTest.log(Status.SKIP, "Test Method Skipped");
		throw new SkipException("Executing skipped Test Method");
	}

	@AfterMethod
	public void afterMethod() {
	}

	@AfterClass
	public void afterClass() {
		extent.flush();
	}

}
