package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "C:\\Users\\Rahul\\IdeaProjects\\Rahul_SelfPractice_BDD_Framework\\src\\test\\java\\Feature\\LoginToApp\\LoginToApp.feature" , // path of feature file,
            glue = "Steps"  // package name of step defiantion
)


public class LoginRunner extends AbstractTestNGCucumberTests
{

}
