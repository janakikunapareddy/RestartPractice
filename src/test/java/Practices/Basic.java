package Practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basic {
	
	public static WebDriver driver;
		 
	
	public static void setup(String browser) {
		
		System.setProperty("webdriver.chromedriver.driver","C:\\Users\\janaki.kunapareddy\\Desktop\\SELENIUM Jars and Drivers\\Web_Drivers\\chromedriver");
		
	if(browser.equalsIgnoreCase("chrome")) {
			
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("FireFox"))
	{
		driver=new FirefoxDriver();
		
	}else if(browser.equalsIgnoreCase("ie")){
		driver=new InternetExplorerDriver();
	}
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)	;	
		
		
		String actualtitle="Welcome: Mercury Tours";
		String et=driver.getTitle();
		
		if(actualtitle.contentEquals(et))
				{
			System.out.println("Test is passed");
		}
			else
			{
				System.out.println("failed");
		
			
		}
		driver.close();
		
	}
	public static void main(String[] args) {
		setup("chrome");
	}

}
