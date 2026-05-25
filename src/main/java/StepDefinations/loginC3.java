package StepDefinations;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.loginpageC3;
import GenericMethodP3.GenericmethodC3;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginC3 extends loginpageC3
{
	@Given("user is on login page")
	public static void useris_on_loginpage() throws InterruptedException, IOException
	{
		browserInitzation();
		ExtentCucumberAdapter.addTestStepLog("application is lanuched successfully");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericmethodC3.captureScreenShot());
	}
	@When("user enters valid username {string}")
	public static void userentersvalidusername(String emailid) throws IOException
	{
		Enter_email(emailid);	
		ExtentCucumberAdapter.addTestStepLog("user is able entered username  "+emailid);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericmethodC3.captureScreenShot());
	}
	
	
	@When("^user enters valid usernameM \"([^\"]*)\"$")
	public static void userentersvalidusernameM(String emailid) throws IOException
	{
		Enter_email(emailid);	
		ExtentCucumberAdapter.addTestStepLog("user is able entered username  "+emailid);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericmethodC3.captureScreenShot());
	}

	@When("^user enters valid passwordM \"([^\"]*)\"$")
	public static void userentersvalidpasswordM(String password) throws IOException
	{
		Enter_password(password);
		ExtentCucumberAdapter.addTestStepLog("user is able entered password  "+password);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericmethodC3.captureScreenShot());
	}
	
	
	@And("user enters valid password {string}")
	public static void userentersvalid_password(String password) throws IOException
	{
		Enter_password(password);
		ExtentCucumberAdapter.addTestStepLog("user is able entered password  "+password);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericmethodC3.captureScreenShot());
	}
	@And("clicks on submit button")
	public static void clicksonsubmitbutton() throws InterruptedException, IOException
	{
		buttonlogin();
		ExtentCucumberAdapter.addTestStepLog("user is able to click on submit buttton");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericmethodC3.captureScreenShot());
	}
	@Then("user should be able to see error message")
	public static void usershouldbeabletoseeerrormessage()
	{	
		if(usershouldbeabletoseeerror().equals("The password you've entered is incorrect."))
		{
			System.out.print("pass");
			System.out.print(usershouldbeabletoseeerror());
		}
		else
		{
			System.out.print("fail");
			System.out.print(usershouldbeabletoseeerror());
			
		}
	}
}
