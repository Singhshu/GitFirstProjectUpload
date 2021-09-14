package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GooglePages;
/*import java.util.concurrent.TimeUnit;*/

public class GoogleSearchTest {
	WebDriver driver;
	GooglePages objTestGoogle;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		/* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); */
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void navigate_to_homepage_click_on_getstarted() throws InterruptedException {
		objTestGoogle = new GooglePages(driver);
		Thread.sleep(3000);
		objTestGoogle.enterValue("Selenium");
		/* Thread.sleep(3000); */
		objTestGoogle.clickOnSearch();
	}

	@AfterTest
	public void tearDownTest() {
		// close browser
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
}
