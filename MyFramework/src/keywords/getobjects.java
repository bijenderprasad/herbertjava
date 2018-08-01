package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class getobjects extends browserconfig {
	
	WebDriver driver;
	
	getobjects() {
		
	}
	
	getobjects(WebDriver driver){
		browserconfig bc = new browserconfig();
		this.driver = bc.setupbrowser(driver);
	}

	

	public WebElement element(By token) {
		return driver.findElement(token);
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


	public void hiturl(String url)
	{
		driver.get(url);
	}
}
