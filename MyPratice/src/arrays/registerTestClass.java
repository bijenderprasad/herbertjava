package arrays;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class registerTestClass {

	testsession test;
	registerloc rloc = new registerloc();
	loc lo = new loc();
	
	By register= lo.register;
	By firstname = rloc.firstname;
	
	registerTestClass(){
		test = new testsession();
	}
	@Test
	public void navigatetohomepage() {

		test.keywordsclass.launchurl("http://newtours.demoaut.com/mercurywelcome.php");
	}

	@Test (dependsOnMethods = "navigatetohomepage")
	public void navigateToRegisterPage() {
		test.keywordsclass.clickonRegisterbutton(register);
		
	}
	
	@Test  (dependsOnMethods = "navigateToRegisterPage")
	public void enterfirstname() {
		test.registerkeyword.enterfirstname(firstname, "Bijender");
	}
	
}
