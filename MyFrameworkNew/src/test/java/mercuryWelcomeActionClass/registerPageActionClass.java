package mercuryWelcomeActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mercuryWelcomegetPage.GetPage;


public class registerPageActionClass extends GetPage{

	
	public registerPageActionClass(WebDriver driver) {
		super(driver);
	}

	public void entername(By token, String value) {
		filltext(token, value);
		
	}


	public void contactDetails(By token, String value) {
		filltext(token, value);
		
	}

	public void addressDetail(By token, String value) {
		filltext(token, value);
	}

	public void selectcountry(By countrydropdown, String value) {
		
		dropdownselection(countrydropdown, value);
	}
	
	public void setupUserLoginData(By token, String value) {
		filltext(token, value);
	}
	
	public void clickOnSubmitButton(By token) {
		click(token);
	}
	
	public void fetchActualusername(By token) {
		trimText(token);
	}
	
	public void Validateusername(String Expected, By token) {
		String Actual = getText(token);
		
		textMessageConfirmation(Expected, Actual);
	}
	
	public void textDisplayedConfirmation(By token) {
		IsElementDisplayed(token);
		String text = getText(token);
		System.out.println(text + " is Displayed on DOM. ");
		}
	 

}
