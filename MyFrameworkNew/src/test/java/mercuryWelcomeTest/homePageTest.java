package mercuryWelcomeTest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

import org.json.simple.parser.ParseException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gurock.testrail.APIException;

import mercuryWelcomeActionClass.testSession;


public class homePageTest {

	
	testSession test;

	
	homePageTest(){
		test = new testSession();
}
	@BeforeSuite
	public void testrunSetup() throws MalformedURLException, IOException, APIException {
		test.manageTestRail.cretaeTestRunFromTestSuite("30", "1933");
	}


	
	@AfterMethod
	public void onFailure(ITestResult result, Method method) throws IOException, APIException, ParseException {
		test.homePageActionClass.aftermethodsetup(result, this.getClass().getName(), method.getName());
	}
	
	@Test
	public void navigatetohomepage() throws IOException, ParseException {

		test.homePageActionClass.launchurl("http://newtours.demoaut.com/mercurywelcome.php");
		//test.homePageActionClass.fetchAllText("//tr[@class='mouseOut']/td[2]//a");
		//test.homePageActionClass.fetchAllText("(//tr[@valign='top'])[2]/td/table/tbody/tr/td/font");
		//test.homePageActionClass.openLinkOnNewWindow("(//td[@class='mouseOut'])[2]");
		//test.homePageActionClass.doubleClickOnElement("//div[@class='footer']");
		//test.homePageActionClass.fetchJsonDataFromFile();
	}
	@Test(dependsOnMethods = "navigatetohomepage")
	public void navigatetohomepage1()  {
		test.homePageActionClass.fetchAllText("//tr[@class='mouseOut']/td[2]//a");
		
	}
	
	
}