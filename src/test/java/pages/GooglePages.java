package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages {
	WebDriver driver;

	@FindBy(xpath = "//input[@name='q']")
	WebElement getStarted;

	@FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']")
	WebElement googleSearch;

	public GooglePages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterValue(String arg1) {
		getStarted.sendKeys(arg1);
	}

	public void clickOnSearch() {
		googleSearch.click();

	}
}
