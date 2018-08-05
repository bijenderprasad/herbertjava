package mercuryWelcomegetPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class getPage {
	WebDriver driver;

	protected getPage(WebDriver driver) {
		this.driver = driver;
	}

	public void hiturl(String url) {
		driver.get(url);
		System.out.println("URL Launchecd : " + url);
	}

	public String displayWebElementName(By token) {
		return driver.findElement(token).getText();
	}

	public void click(By token) {
		String tokenTextName = driver.findElement(token).getText();
		System.out.println(tokenTextName);
		//System.out.println("Clicked on : " + tokenTextName + ", xPath = " + token);
		driver.findElement(token).click();
	}

	public void filltext(By token, String value) {
		driver.findElement(token).sendKeys(value);
		System.out.println("Value Entered in : " + value);
	}

	public void dropdownselection(By countrydropdown, String value) {

		Select sc = new Select(driver.findElement(countrydropdown));
		sc.selectByVisibleText(value);
	}

	public Boolean IsElementDisplayed(By token) {
		String text = driver.findElement(token).getText();
		System.out.println(text + "Is displayed on DOM");
		return driver.findElement(token).isDisplayed();
		}
	
	public String getText(By token) {
		String text= driver.findElement(token).getText();
		return text;
	}
	
	public void textMessageConfirmation(String Expected, String Actual ) {
		Assert.assertEquals("Text is Not Matching", Expected, Actual);
		System.out.println("UserName is As expetced : "+ Expected);
	}
	
	public String trimText(By token) {
		String completetext = driver.findElement(token).getText();
		String requiredText1 = completetext.substring(25);
		String[] requiredtext2 = requiredText1.split(".");
		String requiredtext = requiredtext2[0];
		return requiredtext;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
