package locators;

import org.openqa.selenium.By;

public class registerPageLocators {

	protected By firstname = By.xpath("//input[@name='firstName']");
	protected By lastname = By.xpath("//input[@name='lastName");
	protected By phonne = By.xpath("//input[@name='phone']");
	protected By email = By.xpath("//input[@id='userName']");
	protected By address1 = By.xpath("//input[@name='address1']");
	protected By city = By.xpath("//input[@name='city']");
	protected By state = By.xpath("//input[@name='state']");
	protected By pincode = By.xpath("//input[@name='postalCode']");
	
	protected By country = By.xpath("//select[@name='country']");
	protected By username = By.xpath("//input[@id='email']");
	protected By password = By.xpath("//input[@name='password']");
	protected By confirmPassword = By.xpath("//input[@name='confirmPassword']");
	protected By submit = By.xpath("//input[@name='register']");
	protected By registerlogo = By.xpath("//img[@src='/images/masts/mast_register.gif']");
	protected By footer = By.xpath("//div[@class='footer']");
	protected By register 			= By.xpath("//a[contains(text(),'REGISTER')]");

}
