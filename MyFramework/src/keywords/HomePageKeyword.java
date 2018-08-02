package keywords;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageKeyword extends getobjects{
	WebDriver driver;
	
	public HomePageKeyword() {
		this.driver=super.driver;
	}


	
	public void launchUrl(String url) {
	driver.get(url);

	}
	

	public void clickonRegisterPage(By token)
	{
		element(token).click();
	}
	

	public void stepStartMessage(String testStepName) {
		System.out.println(("***** STARTING TEST STEP:- " + testStepName.toUpperCase() + " *****"));
	}

	public void aftermethodsetup() {
		System.out.println("***************************************************************************************");
	}

	public void clickonRegisterButton(By token)
	{
		element(token).click();
	}
	

	
}
