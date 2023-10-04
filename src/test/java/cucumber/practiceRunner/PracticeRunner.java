package cucumber.practiceRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:practice_test_features", // Location of Feature files
        glue = "cucumber.practiceSteps", // package for steps definitions
        tags = "@Regression1"
)
public class PracticeRunner { // cucumber.steps
}
