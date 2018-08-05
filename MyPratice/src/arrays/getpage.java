package arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class getpage {

	WebDriver driver;

	getpage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void hiturl(String url) {
		driver.get(url);
	}

	public void click(By token) {
		driver.findElement(token).click();
	}

	public void filltext(By token, String value) {
		driver.findElement(token).sendKeys(value);
	}

}
