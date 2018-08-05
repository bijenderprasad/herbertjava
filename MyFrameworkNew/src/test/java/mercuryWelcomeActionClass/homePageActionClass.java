package mercuryWelcomeActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import mercuryWelcomegetPage.getPage;

public class homePageActionClass extends getPage{

	
	public homePageActionClass(WebDriver driver) {
		super(driver);
	}



	public void launchurl(String url) {
		hiturl(url);
	}
	
	public void clickonRegisterbutton(By register) {
	click(register);	
	}
	
	


	public void stepStartMessage(String testStepName) {
		System.out.println(("***** STARTING TEST STEP:- " + testStepName.toUpperCase() + " *****"));
	}

	public void aftermethodsetup() {
		System.out.println("***************************************************************************************");
	}
	
	
	
}
