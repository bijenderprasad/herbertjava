package backup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testsession {
	public static WebDriver driver;
	keywordsclass keywordsclass;
	registerkeyword registerkeyword;

	public WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	testsession() {
		getdriver();
		init();
	}

	public void init() {
		keywordsclass = new keywordsclass(driver);
		registerkeyword = new registerkeyword(driver);
	}

}
