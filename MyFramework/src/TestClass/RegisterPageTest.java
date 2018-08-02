package TestClass;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import locators.registerPageLocators;
import org.testng.annotations.Test;

import keywords.TestInitiators;

public class RegisterPageTest extends registerPageLocators {

	TestInitiators test;

	String url;
	WebDriver driver;

	void initVars() {
		url = "http://newtours.demoaut.com/mercurywelcome.php";

	}

	@BeforeClass
	public void startTestSession() {
		test = new TestInitiators();
		initVars();
	}

	@BeforeMethod
	public void handleTestMethodName(Method method) {
		test.HomePageKeyword.stepStartMessage(method.getName());
	}

	@AfterMethod
	public void setupAfterTestMethod() {
		test.HomePageKeyword.aftermethodsetup();
	}

	@Test
	public void Step01_LaunchApplication() {
		System.out.println(url);
		test.HomePageKeyword.launchUrl(url);
		// System.out.println("User is on Web Home Page");
	}

	@Test(dependsOnMethods = "Step01_LaunchApplication")
	public void moveToRegisterPage() {
		test.HomePageKeyword.clickonRegisterPage(register);
		test.RegisterPageKeywords.fillFirstName(firstname, "Bijender");
	}

}