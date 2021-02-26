package testRunner;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features= {"src/test/resources/Features"},glue={"stepDefinition"},
plugin = { "pretty:target/cucumber-pretty.txt", "html:target/cucumber-reports", "json:target/cucumber/cucumber.json" , "junit:target/cucumber-results.xml" },
monochrome = true)
public class Runner 				
{		

}