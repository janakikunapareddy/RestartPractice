package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	
	
	public static void main (String [] args){
																		// Open browser
		WebDriver driver = new ChromeDriver();
																			// To maximize the window
		driver.manage().window().maximize();
																				// Open Application
		driver.get("https://www.google.co.in/?gws_rd=ssl#q=softwaretestingmaterial.com");
																		// Get text of a particular link
		//String FindElement = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/h3/a")).getText();
		
													// Print the value of the link
		//System.out.println(FindElement);
		//driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/h3/a")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Java Tutorial')]")).click();;
																
		}
		
}
