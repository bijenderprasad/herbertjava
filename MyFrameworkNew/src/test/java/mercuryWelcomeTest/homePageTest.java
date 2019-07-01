package mercuryWelcomeTest;

import org.testng.annotations.Test;

import mercuryWelcomeActionClass.testSession;


public class homePageTest {

	
	testSession test;

	
	homePageTest(){
		test = new testSession();
	}
	@Test
	public void navigatetohomepage() {

		test.homePageActionClass.launchurl("http://newtours.demoaut.com/mercurywelcome.php");
	}

}
