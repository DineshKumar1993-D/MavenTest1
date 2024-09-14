package runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import baseclass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//features",
					glue = "com.stepdefinition",
				plugin ={"pretty",
						"html:Reports/HtmlReport.html",
						"json:Reports/JsonReport.json",
"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"},
			monochrome=true,
			dryRun =false,
			strict=false)
		//	tags="@smoketest")

public class TestRun extends BaseClass {

	@BeforeClass
	public static void setUp() {
		
		
		browserLaunch("edge");
		
	}
	@AfterClass
	public static void tearDown() {
		
		quitBrowser();
	}
}
