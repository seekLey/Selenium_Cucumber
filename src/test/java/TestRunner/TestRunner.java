package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/FeatureFiles",
        glue={"StepDefinition"}, // this gives path for the Java code
        monochrome = true, // this formats the output in the console
        plugin = {"pretty","html:target/HtmlReports"}
        )
public class TestRunner {

}
