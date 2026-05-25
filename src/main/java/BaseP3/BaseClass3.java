package BaseP3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass3 
{
	//driver initalization/brwoser initalization // launch the application// browser close and
	//BD connection
	
	public static String browser="chrome";
	public static String URL="https://www.fb.com";
	public static WebDriver driver;
	
	public static void browserInitzation() 
	{
		switch(browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();	
			 driver= new ChromeDriver();
				 URL="https://www.fb.com";
				 driver.get(URL);
			 
			 break;
			 
		case "IE":
			 WebDriverManager.iedriver().setup();
			 driver= new InternetExplorerDriver();
			 driver.get(URL);
			 break;	
		
		}
		
	}
	public static void browser_Close()
	{
		driver.close();
	}
	

}
