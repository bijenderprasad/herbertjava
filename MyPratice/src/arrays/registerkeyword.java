package arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerkeyword extends getpage {

	registerkeyword(WebDriver driver) {
		super(driver);
	}

	public void enterfirstname(By token, String value) {
		filltext(token, value);
	}

}
