package keywords;

import org.openqa.selenium.WebDriver;

public class TestInitiators {

	WebDriver driver;
	public HomePageKeyword HomePageKeyword;
	public RegisterPageKeywords RegisterPageKeywords;
	


	
	public void initPage() {
		
		HomePageKeyword = new HomePageKeyword();
		RegisterPageKeywords = new RegisterPageKeywords();
		
	}
	

	public TestInitiators()
	{
		initPage();

	}
	
	
}
