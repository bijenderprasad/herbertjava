package BijenderTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class getobjects{

	WebDriver driver;
	
	protected getobjects() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	public void launchUrl(String url) {
		driver.get(url);

	}

	public WebElement element(By gmailLink) {
		return driver.findElement(gmailLink);
	}

	public String getData(By token) {
		String element = driver.findElement(token).getText();
		return element;
	}

	public void IsElementDisplayed(By element) {
		driver.findElement(element).isDisplayed();
		String elementText = driver.findElement(element).getText();
		System.out.println(elementText + "Is Displayed on DOM");

	}

	public void verifyText(String Actual, String Expected) {
		Assert.assertEquals(Actual, Expected, " Asseration Failed");
		System.out.println("Asseration Passed :" + Actual + " Text is matching with Expected text");
	
}
	public void filltext(By token, String value) {
		driver.findElement(token).sendKeys(value);
	}
}
