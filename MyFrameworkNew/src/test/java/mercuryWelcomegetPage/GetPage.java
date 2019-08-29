package mercuryWelcomegetPage;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GetPage {
   protected WebDriver driver;

	protected GetPage(WebDriver driver) {
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
	
	public void doubleClickOnElement(String token) {
		Actions ac = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(token));
		ac.moveToElement(element).build().perform();
		ac.doubleClick().build().perform();
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
	
	public void changeWindow(int i) {
		Set <String> windows;
		String[] win;
		windows = driver.getWindowHandles();
		/*for(String winHandle : driver.getWindowHandles())
		{
		    driver.switchTo().window(winHandle);
		}*/
		win = windows.toArray(new String [windows.size()]);
		driver.switchTo().window(win[i]);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(win[0]);
		System.out.println(driver.getCurrentUrl());
		
	}
	
	public  void parseJSONData() throws IOException, ParseException {
		
		 Object a = _parseJSONData("last name");
		 System.out.println(a);
	}
	
	public static Object _parseJSONData(String keyword) throws IOException, ParseException {
		Object n = null;
		ArrayList<String> listdata = new ArrayList<String>();

		Reader reader = new FileReader(
				"C:/Users/bijenderprasad/Desktop/Herbert/herbertjava/MyFrameworkNew/TestData/JSONTestFile.json");

		JSONParser parser = new JSONParser();

		JSONArray jsonArr = (JSONArray) parser.parse(reader);

		for (Object obj : jsonArr) {

			JSONObject jo = (JSONObject) obj;
			n = jo.get(keyword);
		}

		if (keyword.equals("last name")) {
			{

				JSONArray jArray = (JSONArray) n;
				if (jArray != null) {
					for (int i = 0; i < jArray.size(); i++) {
						listdata.add((String) jArray.get(i));
					}
				}
			}
		}
		if (keyword.equals("last name"))
			return listdata.get(1);
		else
			return n;
	}

}
