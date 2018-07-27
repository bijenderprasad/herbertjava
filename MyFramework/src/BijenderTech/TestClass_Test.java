package BijenderTech;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass_Test  {

	TestInitiators test;
	TestClass_Test TestClass_Test;
	static WebDriver driver;
	String google ;
	
	
	 void initVars() {
		google = "https://www.google.co.in";	
	}
	
	//public TestClass_Test(WebDriver driver) {
	//super();}
								
	@BeforeClass
	public void startTestSession()
	{
		test = new TestInitiators();
		TestClass_Test = new TestClass_Test();
		initVars();
		
	}
	
	
	
	@Test
		public void TestCase1_LaunchApplication() {
		test.ActionClass.geturl(google);
		test.ActionClass.clickOnGmailLink();

		
		
	}

}