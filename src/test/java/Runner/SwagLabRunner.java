package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import java.awt.*;

@CucumberOptions (
        features="C:\\Users\\Rahul\\IdeaProjects\\Rahul_SelfPractice_BDD_Framework\\src\\test\\java\\Features",
        glue = {"Steps", "Hooks"},
        publish = true,
        plugin = {"pretty","html:Reports/SwagLabReport.html"},
        tags = "@product_checkoutWithSubmit_usingScenarioOutline"
)
public class SwagLabRunner extends AbstractTestNGCucumberTests {

}
