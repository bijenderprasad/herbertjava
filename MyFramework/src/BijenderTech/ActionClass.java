package BijenderTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClass extends locators {
	WebDriver driver;

	ActionClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	void geturl(String url) {
		driver.get(url);

	}

	public WebElement element(By gmailLink) {
		return driver.findElement(gmailLink);
	}

	// -----------------------------------------------------------------------------------------------------------------------------
	// -----------------------------------------------------------------------------------------------------------------------------

	public void clickOnGmailLink() {
		element(gmailLink).click();

	}

}
