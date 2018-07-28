package HomePageLocators;

import org.openqa.selenium.By;


public class HomePageLocators{


	protected By Bannerlogo		 	= By.xpath("//img[@src='/images/banner2.gif']");
	protected By usernamefield 		= By.xpath("//input[@name='userName']");
	protected By passwordfield		= By.xpath("//input[@name='password']");
	protected By Sign_On 			= By.xpath("//a[contains(text(),'SIGN-ON')]");
	protected By register 			= By.xpath("//a[contains(text(),'REGISTER')]");
	protected By support 			= By.xpath("//a[contains(text(),'SUPPORT')]");
	protected By contact 			= By.xpath("//a[contains(text(),'CONTACT')]");
	protected By sign_inbutton 		= By.xpath("//input[@name='login']");
	
	
	
}
