package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/FeatureFile",glue="StepDefinitions", monochrome=true, tags="@RegisterUser", plugin= {"pretty", "html:target/cucumber.html"})
public class Runner extends AbstractTestNGCucumberTests {

}
