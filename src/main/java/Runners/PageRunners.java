package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(

        tags = {"@PageRunners"},

        features = {"classpath:/src/test/java/VakifbankCaseScenario.feature"},
        glue = {"StepDefinition"},
        dryRun = false
)

public class PageRunners extends AbstractTestNGCucumberTests {

}
