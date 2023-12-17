package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "C:\\Users\\Nishant Dhanani\\IdeaProjects\\signinnopc\\src\\test\\resources\\Signin.feature",
        glue = {"stepDefinition"},
        format = {"pretty","html:htmlreport"},
        dryRun = false


)

public class TestRunner {
}
