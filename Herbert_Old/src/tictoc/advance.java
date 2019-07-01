package tictoc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class advance {

	public static void main(String[] args) throws SQLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		System.out.println(driver.findElement(By.xpath("//tbody//tr[16]//td[1]//font[1]//b[1]")).getText());
		
		
		
		
				

	}

}
