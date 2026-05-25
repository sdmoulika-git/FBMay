package GenericMethodP3;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import BaseP3.BaseClass3;

public class GenericmethodC3  extends BaseClass3{

	
	
	
	public static String captureScreenShot() throws IOException 
	{
		
		TakesScreenshot tc=(TakesScreenshot)driver;
		//we are Takescreenshot as interface and upcasting driver as TakesScreenshot.
			
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
				
		File destfile=new File("D://KPHP//"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(scrfile, destfile);
			
		return destfile.getAbsolutePath();
	}	
	
    
public static void SendKeys(String text,WebElement abc)
{
abc.sendKeys(text);

}

public  static void JSsendkeys(WebElement element, String text) {
JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("arguments[0].value='mahesh@gmail.com';",InputEmail);
js.executeScript("arguments[0].value='" + text+ " ';",element);
}

public  static void scrollToElementclick(WebElement element) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", element);
}
public  static void scrollToElement(WebElement element) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView(true);", element);
}
public static void scroll(int x, int y) {
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,10000)");
js.executeScript("window.scrollBy(" + x + " ," +y+ ")");

}

public static String getenteredvalue(WebElement ele)
{
return ele.getDomProperty("value");
}
public static void clear(WebElement ele)
{
ele.clear();
}

public static void alerts_ok()
{
driver.switchTo().alert().accept();
}


public static void alerts_cancel()
{
driver.switchTo().alert().dismiss();
}
public static String alerts_getext()
{
return driver.switchTo().alert().getText();
}

public static void SelectBY_value(String value, WebElement ele)
{
Select obj= new Select(ele);
obj.selectByValue(value);
}

public static void check_click(String Text,String text2, By input) throws InterruptedException
{
List<WebElement> values=driver.findElements(input);

System.out.println(values.size());

for(int i=0;i<=values.size()-1;i++)
{
if(  (Text.equals(values.get(i).getAttribute("value"))   ||   (text2.equals(values.get(i).getAttribute("value")) )) )
{
Thread.sleep(3000);
if(values.get(i).isSelected())
{
System.out.println("already selected");

}
else
{
	values.get(i).click();
}

}
//	System.out.println(values.get(i).getAttribute("value"));

}
}

public static String getText(WebElement ele)
{
return ele.getText();
}

public static void Click(WebElement xyz)
{
xyz.click();
}

public static String Gettitle()
{
return driver.getTitle();
}

}

