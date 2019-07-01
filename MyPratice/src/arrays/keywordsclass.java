package arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class keywordsclass extends getpage{

	
	keywordsclass(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	public void launchurl(String url) {
		hiturl(url);
	}
	
	public void clickonRegisterbutton(By register) {
	click(register);	
	}
	
}
