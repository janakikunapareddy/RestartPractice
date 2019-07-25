package Practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doubtfirefox {
	

	
	public static void main (String [] args){
		// Open browser
		WebDriver driver = new ChromeDriver();
		// To maximize the window
		driver.manage().window().maximize();
		// Open Application
		driver.get("https://www.google.co.in/?gws_rd=ssl#q=softwaretestingmaterial.com");
		// Get text of a particular link
		String FindElement = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/h3/a")).getText();
		// Print the value of the link
		System.out.println(FindElement);
		// Click on the link
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/h3/a")).click();
		}
		}
/*WebDriver driver = new ChromeDriver();
// To maximize the window
driver.manage().window().maximize();
// Open application
driver.get("https://www.google.co.in/?gws_rd=ssl#q=softwaretestingmaterial.com");
// Get the list of all links
List<WebElement> link = driver.findElements(By.xpath("//*[@id='rso']/div/div/div/h3/a"));
// Using for loop to display the text of all the links
for(WebElement element:link)
{
System.out.println(element.getText());
}
// Click on the first link
driver.findElement(By.xpath("//*[@id='rso']/div/div/div/h3/a")).click();
}
}*/
	/*public static void main(String[] args) {
		
	WebDriver driver=new FirefoxDriver();
		driver.get("https://www.toolsqa.com/");
		driver.close();
 //Path to the folder where you have extracted the IEDriverServer executable
 String service = "C:\\Users\\janaki.kunapareddy\\Desktop\\SELENIUM Jars and Drivers\\Web_Drivers\\IEDriverServer.exe";
 System.setProperty("webdriver.ie.driver", service);
 
 InternetExplorerDriver  driver = new InternetExplorerDriver();
 driver.get("http://demoqa.com");
	}*/








