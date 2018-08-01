package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageKeywords extends getobjects{
	static WebDriver driver;
	
	public RegisterPageKeywords () {
		super();
	}

	public void fillFirstName(By token, String value)
	{
		filltext(token, value);
	}


}
