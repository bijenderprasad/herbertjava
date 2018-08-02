package arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpage {

	WebDriver driver;
	
	getpage() {
		setupbrowswer();
	}
	
public void setupbrowswer() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
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
