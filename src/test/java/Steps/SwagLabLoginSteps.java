package Steps;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import PageClasses.SwagLabHomePage;
import PageClasses.SwagLabLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.io.IOException;

public class SwagLabLoginSteps {

    SwagLabLoginPage login=new SwagLabLoginPage(DriverFactory.driver);
    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);


    @Given("user open Swaglab application login url {string}")
    public void user_open_swaglab_application_login_url(String urlkey) throws IOException {
       String urlvalue = UtilityClass.getPFData(urlkey);
       DriverFactory.driver.get(urlvalue);

    }
    @Given("user enters username as {string}")
    public void user_enters_username_as(String unkey) throws IOException {
        String UNValue = UtilityClass.getPFData(unkey);
        login.enterUN(UNValue);

    }
    @Given("user enters password as {string}")
    public void user_enters_password_as(String pwkey) throws IOException {
        String PWValue = UtilityClass.getPFData(pwkey);
        login.enterPWD(PWValue);

    }
    @Given("user click on login button")
    public void user_click_on_login_button()
    {
        login.clickOnLogionBtn();

    }

    @Then("verify home page visible with logo text as {string}")
    public void verify_home_page_visible_with_logo_text_as(String explogoValue)
    {
      String actlogoValue =  home.getLogoText();
        Assert.assertEquals(actlogoValue, explogoValue, "Act & exp logo text mismatch" );
    }

}
