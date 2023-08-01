package in.swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features//swiggy_order.feature",
		glue = "in.swiggy.testscripts"
		//dryRun = true
		//tags = "@product_purchase or @login_functionality"
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {
        
}




