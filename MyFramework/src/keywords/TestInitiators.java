package keywords;

import org.openqa.selenium.WebDriver;

public class TestInitiators extends HomePageKeyword{

	WebDriver driver;
	public HomePageKeyword HomePageKeyword;
	public RegisterPageKeywords RegisterPageKeywords;
	
	public TestInitiators()
	{
		this.driver= setupbrowser(driver);
		initPage();
		}

	
	public void initPage() {
		
		HomePageKeyword = new HomePageKeyword();
		RegisterPageKeywords = new RegisterPageKeywords();
		
	}
	


	
	
}
