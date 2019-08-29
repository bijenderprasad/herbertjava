package mercuryWelcomeActionClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.gurock.testrail.APIException;

import mercuryWelcomegetPage.manageTestRail;

import mercuryWelcomegetPage.GetPage;

public class homePageActionClass extends GetPage{
	

	public homePageActionClass(WebDriver driver) {
	     super(driver);
	}

	manageTestRail manageTestRail = new manageTestRail();

	public void launchurl(String url) {
		hiturl(url);
	}
	
	public void clickonRegisterbutton(By register) {
	   click(register);	
	}
	
	


	public void stepStartMessage(String testStepName) {
		System.out.println(("***** STARTING TEST STEP:- " + testStepName.toUpperCase() + " *****"));
	}

	public void aftermethodsetup(ITestResult result, String className, String methodName) throws IOException, APIException, ParseException {
		System.out.println("***************************************************************************************");
		String[] name = className.split("\\.");
		String classname = name[1];
		manageTestRail.addResultForTestCase(result.getStatus() , "", classname, methodName);
		
	}
	
	public void fetchAllText(String token) {
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(token)));
		
		List<WebElement> l = driver.findElements(By.xpath(token));
		for (WebElement we : l) {
			System.out.println(we.getText());
		}
		}
	
	public void rightClickonLink(String token) {
	WebElement link = driver.findElement(By.xpath(token));
	Actions ac = new Actions(driver);
	ac.moveToElement(link).build().perform();
	ac.contextClick().build().perform();;
	}
	
	public void openLinkOnNewWindow(String token) {
		WebElement link = driver.findElement(By.xpath(token));
		Actions ac = new Actions(driver);
		ac.moveToElement(link).build().perform();
		ac.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
		changeWindow(1);
		
	}
	
	public void fetchJsonDataFromFile() throws IOException, ParseException {
		parseJSONData();
	}
	
	
	
}
