package cucwithPOM;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:test-outout", "json:json_output/cucumber.xml","junit:junit_xml/cucmber.xml" }, 
				features = "C:/Users/RITHWIK/My_Work2/FreeCRM-Cucumber/src/main/java/com/qa/features/FreeCRM.feature",
				glue = { "cuwithPageStepDef" },
				monochrome = true, 
				strict = true, 
				dryRun = false
				)

public class CucwithPOMRunner {

}
