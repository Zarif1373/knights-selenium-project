package cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "classpath:test_features", // Location of Feature files.
        glue = "cucumber.steps", // package for steps definitions
        tags = "@Regression",
        plugin = {
                "pretty",
                "html:target/htmlReports/cucumber-pretty.html",
        }
)
public class TestRunner {

}
