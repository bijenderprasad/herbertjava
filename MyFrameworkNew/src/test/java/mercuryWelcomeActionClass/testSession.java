package mercuryWelcomeActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSession {

	public static WebDriver driver;
	public homePageActionClass homePageActionClass;
	public registerPageActionClass registerPageActionClass;
	public mercuryWelcomegetPage.manageTestRail manageTestRail;

	public WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/bijenderprasad/Desktop/Herbert/herbertjava/MyFrameworkNew/driver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public testSession() {
		getdriver();
		init();
	}

	public void init() {
		homePageActionClass = new homePageActionClass(driver);
		registerPageActionClass = new registerPageActionClass(driver);
		manageTestRail = new mercuryWelcomegetPage.manageTestRail();
	}
}
