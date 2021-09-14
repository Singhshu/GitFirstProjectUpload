package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.GooglePages;

public class Login extends BaseSetup{
	GooglePages objTestGoogle;
	
	@BeforeTest
	public void setuptest() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	}
	
	@Test
	public void Login_TestCase1() throws InterruptedException {
		ExtentTest test= extent.createTest("Login_TestCase1");
		objTestGoogle = new GooglePages(driver);
		Thread.sleep(3000);
		objTestGoogle.enterValue("Selenium");
		objTestGoogle.clickOnSearch();
		test.log(Status.INFO, "Inside Login_TestCase1");
		test.pass("PASS");
	}
	
	@AfterTest
	public void tearDownTest() {
		// close browser
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
