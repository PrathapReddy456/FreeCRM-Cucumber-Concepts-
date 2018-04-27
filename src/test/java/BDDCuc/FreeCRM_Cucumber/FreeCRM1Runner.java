   package BDDCuc.FreeCRM_Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		format= {"pretty","html:test-outout","json:json_output/cucumber.xml", "junit:junit_xml/cucmber.xml"},
		features = "FreeCRM_Features",
		glue={"BDDCuc.FreeCRM_Cucumber"},
		monochrome= true,
		strict = true,
		dryRun= false
		)
public class FreeCRM1Runner {

}
