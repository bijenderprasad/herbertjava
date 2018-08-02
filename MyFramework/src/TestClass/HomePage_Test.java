package TestClass;

import java.lang.reflect.Method;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import keywords.TestInitiators;
import locators.HomePageLocators;

public class HomePage_Test extends TestInitiators {

	
	TestInitiators test = new TestInitiators();
	WebDriver driver;
	String google, url, password,username;
	
	private void initVars() {	
		url = "http://newtours.demoaut.com/mercurywelcome.php";
		username= "Bijender"; 
	}
	
								
	@BeforeClass
	public void startTestSession() {
		initVars();
		}
	
	@BeforeMethod
	public void handleTestMethodName(Method method)
	{
		test.HomePageKeyword.stepStartMessage(method.getName());
		}
	
	@AfterMethod
	
	public void setupAfterTestMethod()
	{
		test.HomePageKeyword.aftermethodsetup();
		}
	
	@Test
		public void Step01_LaunchApplication() {
		System.out.println(url);
		driver.get(url);
		}



}

