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
		driver.get("http://10.0.1.86/tatoc");
		System.out.println("URL hit");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Advanced Course')]")).click();
		
		Actions ac = new Actions(driver);
		
		WebElement menu2 = driver.findElement(By.xpath("//span[@class='menutitle']"));
		ac.moveToElement(menu2).build().perform();
		
		WebElement gonext = driver.findElement(By.xpath("//span[contains(text(),'Go Next')]"));
		ac.moveToElement(gonext).click().build().perform();
		
		
		String host ="10.0.1.86";
		String url = "jdbc:mysql://"+host+":"+"/tatoc";
		
		Connection con = DriverManager.getConnection(url,"tatocuser","tatoc01");
		
		
		
				

	}

}
