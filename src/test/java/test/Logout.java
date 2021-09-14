package test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Logout extends BaseSetup{
	@Test
	public void Logout_TestCase1() {
		ExtentTest test= extent.createTest("Logout_TestCase1");
		test.log(Status.INFO, "Inside Logout_TestCase1");
		test.pass("PASS");
	}
	
	@Test
	public void Logout_TestCase2() {
		ExtentTest test= extent.createTest("Logout_TestCase2");
		test.log(Status.INFO, "Inside Logout_TestCase2 method");
		test.fail("FAIL");
	}

}
