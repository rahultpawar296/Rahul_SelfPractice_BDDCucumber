package Steps;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import PageClasses.SwagLabHomePage;
import PageClasses.SwagLabLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @Given("user enters invalid username as {string}")
    public void user_enters_invalid_username_as(String UNIncorrect)
    {
        login.enterUN(UNIncorrect);

    }
    @Given("user enters invalid password as {string}")
    public void user_enters_invalid_password_as(String PWIncorrect)
    {
        login.enterPWD(PWIncorrect);
    }

    @Then("login failed with error msg visible as {string}")
    public void login_failed_with_error_msg_visible_as(String extLoginFailedErrorMsg) {
        String actLoginFailedErrorMsg = login.getErrorMsg();

        System.out.println ("actual message : " + actLoginFailedErrorMsg);
        System.out.println("expected message : " +extLoginFailedErrorMsg);
        if (actLoginFailedErrorMsg.contains(extLoginFailedErrorMsg))
        {
            System.out.println("TC Pass");
        }
        else
        {
            System.out.println("TC fail");
        }
        login.getErrorMsg();
    }



    @When("user enter UN as {string}")
    public void user_enter_un_as(String UnKey) throws IOException
    {
        if(UnKey.startsWith("#"))
        {
            String UnValue=UtilityClass.getPFData(UnKey.substring(1));  //  #UN  ->UN
            login.enterUN(UnValue);
        }
        else
        {
            login.enterUN(UnKey);
        }
    }

    @When("user enter PWD as {string}")
    public void user_enter_pwd_as(String pwdKey) throws IOException
    {
        if (pwdKey.startsWith("#"))
        {
            String pwdValue=UtilityClass.getPFData(pwdKey.substring(1));   //#pwd -> pwd
            login.enterPWD(pwdValue);
        }
        else
        {
            login.enterPWD(pwdKey);
        }

    }

    @When("wait for {int} sec")
    public void wait_for_sec(Integer timeInSec) throws InterruptedException
    {
        Thread.sleep(timeInSec*1000);
    }

    @Then("verify login failed error message with message {string}")
    public void verify_login_failed_error_message_with_message(String expLoginFailedErrorMsg)
    {
        String actLoginFailedErrorMsg=login.getErrorMsg();
        Assert.assertEquals(actLoginFailedErrorMsg,expLoginFailedErrorMsg,"Failed-act & exp error msg mismatch");
    }

    @When("user click on addToCart button")
    public void user_click_on_add_to_cart_button()
    {
        home.clickOnAddToCartBtn();
    }
    @Then("verify remove button is visible")
    public void verify_remove_button_is_visible()
    {
        boolean actResult = home.checkRemoveAddToCartElementPresentOrNot();
        Assert.assertTrue(actResult,"Failed-actResult is false");
    }

    @Then("verify total product size should be {int}")
    public void verify_total_product_size_should_be(Integer expTotalProductSize)
    {
        int actProductSize = home.getTotalProductSize();
        Assert.assertEquals(actProductSize,expTotalProductSize,"Failed- Act & Exp Product Size mismatch");
    }


}
