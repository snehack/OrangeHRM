package testrunners;

import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/adminlogin.feature",
glue="stepdefinitions",dryRun=false,tags=("@tag2"), 
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/loginresult.html"})
public class AdminLoginTest 
{import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

}
