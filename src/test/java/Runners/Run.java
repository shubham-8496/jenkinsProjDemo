package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/firstTest.feature",
        glue = "stepdefinitions")
        //plugin = {"json:target/cucumber-report.json"})
       // tags = "@functional")
public class Run extends AbstractTestNGCucumberTests {

}
