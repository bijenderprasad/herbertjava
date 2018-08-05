package backup;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestClass  {

	testsession test = new testsession();
	loc lo = new loc();
	
	By register= lo.register;
	
@Test
public void navigatetohomepage() {

	test.keywordsclass.launchurl("http://newtours.demoaut.com/mercurywelcome.php");
}

@Test (dependsOnMethods = "navigatetohomepage")
public void navigateToRegisterPage() {
	test.keywordsclass.clickonRegisterbutton(register);
}

}
