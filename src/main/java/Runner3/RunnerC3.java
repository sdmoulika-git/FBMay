package Runner3;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"featuresofproject/login5.feature"},// path of feature
        glue =     {"StepDefinations"},//path of stepdefinations
		 plugin =    { "pretty","html:target/cucumber-reports",
        		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        		 "rerun:target/failedrerun.txt"
        		 },
	tags="@SIT",
 monochrome = true //true if terminal output should be without colours.
)
public class RunnerC3  extends AbstractTestNGCucumberTests
{

}
