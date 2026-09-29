package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
     //   features = "C:\\Users\\Rahul\\IdeaProjects\\Rahul_SelfPractice_BDD_Framework\\src\\test\\java\\Feature\\LoginToApp\\Ex1_LoginToApp.feature" , // path of feature file,
        features = "C:\\Users\\Rahul\\IdeaProjects\\Rahul_SelfPractice_BDD_Framework\\src\\test\\java\\Feature" , // path of feature folder,
//        glue="Steps",  //package name of step definition class -> without Hooks
        glue={"Steps","Hooks"}, //package name of step definition & Hooks class -> with hooks
        publish = true,
//        tags = "@login"
//        tags = "@Sanity or @Regression"
//        tags = "@MayRelease26 and @Regression"
        tags = "not @Smoke"
)


public class LoginRunner extends AbstractTestNGCucumberTests
{

}
