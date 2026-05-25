package Allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseP3.BaseClass3;

public class loginpageC3 extends BaseClass3
{
	public static By emailid=By.name("email");
	
	public static By passwordid=By.name("pass");
	
	public static By login=By.xpath("//span[text()='Log in']");
	public static By loginerrormessage=By.xpath("//span[contains(text(),'The password you')]");
	public static void Enter_email(String email)
	{
		driver.findElement(emailid).sendKeys(email);
	}
	
	public static void Enter_password(String password)
	{
		driver.findElement(passwordid).sendKeys(password);
	}
	public static void buttonlogin() throws InterruptedException
	{
		driver.findElement(login).click();
		Thread.sleep(19000);
	}
	public static String usershouldbeabletoseeerror()
	{
		return driver.findElement(loginerrormessage).getText();
	}
	
}
