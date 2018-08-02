package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageKeywords extends getobjects{
	WebDriver driver;
	
	public RegisterPageKeywords () {
		this.driver= super.driver;
	}

	public void fillFirstName(By token, String value)
	{
		filltext(token, value);
	}


}
