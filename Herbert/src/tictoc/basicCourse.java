package tictoc;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class basicCourse {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		System.out.println("URL hit");
		driver.findElement(By.xpath("//a[contains(text(),'Basic Course')]")).click();
		driver.findElement(By.xpath("//div[@class='greenbox']")).click();
		
		//Handling Frame Dungeon
				
				driver.switchTo().frame("main");
				String box1 = driver.findElement(By.xpath("//div[contains(text(),'Box 1')]")).getCssValue("background-color");
				System.out.println(box1);
				
				driver.switchTo().frame("child");
				String box2 = driver.findElement(By.xpath("//div[contains(text(),'Box 2')]")).getCssValue("background-color");
				
				driver.switchTo().parentFrame();
				
				while(true){		
					if(box1.equals(box2)){
						driver.findElement(By.xpath("//a[@onclick='gonext();']")).click();
						System.out.println("Clicked on Proceed");
						break;
					}
					else{
						driver.findElement(By.xpath("//a[@onclick='reloadChildFrame();']")).click(); //Clicked on Repaint Box 2
						Thread.sleep(600);
						driver.switchTo().frame("child");
						box2 = driver.findElement(By.xpath("//div[contains(text(),'Box 2')]")).getCssValue("background-color");
						System.out.println(box2);
						driver.switchTo().parentFrame();
					}
					
				}
	
				Actions ac = new Actions(driver);
				WebElement source = driver.findElement(By.xpath("//div[@id='dropbox']"));
				System.out.println(source.getText());
				WebElement target = driver.findElement(By.xpath("//div[@id='dragbox']"));
				System.out.println(target.getText());
				Thread.sleep(2000l);
				//ac.dragAndDrop(source, target).build().perform();
				ac.clickAndHold(target).moveToElement(source).release(source).build().perform();
				driver.findElement(By.xpath("//a[@onclick='gonext();']")).click();
				
				
				//Click on Launch your window popup
				driver.findElement(By.xpath("//a[contains(text(),'Launch Popup Window')]")).click();
				
			
				Set<String> allwindows = driver.getWindowHandles();
				Iterator<String> it = allwindows.iterator();
				String parentwindow = it.next();
				String childwindow = it.next();
				
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Bijender");
				driver.findElement(By.xpath("//input[@id='submit']")).click();
				driver.switchTo().window(parentwindow);
				driver.findElement(By.xpath("//a[@onclick='gonext();']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Generate Token')]")).click();
				
				
				// Adding cookies
				String tokenloacton =   driver.findElement(By.xpath("//span[@id='token']")).getText();
				String token=tokenloacton.substring(7, tokenloacton.length());
				System.out.println(token);
				Cookie name = new Cookie("nn", token);
				driver.manage().addCookie(name);
				driver.findElement(By.xpath("//a[@onclick='gonext();']")).click();
				String finish = driver.findElement(By.xpath("//span[@class='finish']")).getText();
				String Actual = "Obstacle Course is Complete!";
				if (finish.equalsIgnoreCase(Actual))
				{
					System.out.println("TEST PASS : - YOU HAVE COMPLETED THE ASSESSMENT");
					System.out.println("Congrats STUDENT");
				}
			
				else 
				{
				System.out.println("TEST CASE FAILED");	
				}
				
				
				
				
				
			
	}
}
