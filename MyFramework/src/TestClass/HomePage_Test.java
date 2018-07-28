package TestClass;

import java.lang.reflect.Method;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BijenderTech.TestInitiators;
import HomePageLocators.HomePageLocators;

public class HomePage_Test extends HomePageLocators {

	
	TestInitiators test;
	HomePage_Test HomePage_Test;
	static WebDriver driver;
	String google, url, password,username;
	

	
	
	 void initVars() {	
		url = "http://newtours.demoaut.com/mercurywelcome.php";
		username= "Bijender"; 
	}
	
								
	@BeforeClass
	public void startTestSession()
	{
		test = new TestInitiators();
		HomePage_Test = new HomePage_Test();
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
		test.getobjects.launchUrl(url);
		System.out.println("User is on Web Home Page");
		
	}
	@Test
	public void Step02_verifyTextPresentInHomePage() {
	test.getobjects.IsElementDisplayed(Bannerlogo);
	test.getobjects.filltext(usernamefield, username);
	}
		
		



}

