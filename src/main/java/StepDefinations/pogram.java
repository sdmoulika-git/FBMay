package StepDefinations;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class pogram {

	public static void login()
	{
		System.out.println("data");
	}
	public static void main(String[] args)
	{
		String expectedresult="Hello welcome to selenium";
		
		String actualresult="Hello welcome to selenium1";
		boolean result=false;
		//SoftAssert sa= new SoftAssert();
		
		//sa.assertEquals(actualresult, expectedresult, "both are not matching");
		
		//sa.assertTrue(result, "it not valid");
		 login();
		// sa.assertAll();// print all failed message
		 
		 Assert.assertEquals(actualresult, expectedresult, "both are not matching");
			Assert.assertTrue(result, "it not valid");
	}

}
