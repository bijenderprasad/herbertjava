package keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserconfig {
	
	
	
	public WebDriver setupbrowser(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	public browserconfig(WebDriver driver)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		this.driver=driver;
	}*/

}
