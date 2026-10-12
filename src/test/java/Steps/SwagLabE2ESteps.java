package Steps;

import LibraryFiles.DriverFactory;
import PageClasses.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SwagLabE2ESteps {

    SwagLabLoginPage login=new SwagLabLoginPage(DriverFactory.driver);
    SwagLabHomePage home=new SwagLabHomePage(DriverFactory.driver);
    SwagLabCartPage cart = new SwagLabCartPage(DriverFactory.driver);
    SwagLabCheckoutPage checkout = new SwagLabCheckoutPage(DriverFactory.driver);
    SwagLabCheckoutOverviewPage checkoutoverview = new SwagLabCheckoutOverviewPage(DriverFactory.driver);
    SwagLabCheckoutComplete checkoutcomplete = new SwagLabCheckoutComplete(DriverFactory.driver);


    @When("user click on Add to Cart Sauce Labs Bike Light item")
    public void user_click_on_add_to_cart_sauce_labs_bike_light_item()
    {

        home.clickOnbikeLightAddToCartBtn();
    }

    @Then("use click on Cart Page")
    public void use_click_on_cart_page()
    {
        home.clickOnCartBtn();
    }


    @Then("verify title of Cart page should be  {string}")
    public void verify_title_of_cart_page_should_be(String expCartPageTitle)
    {
        String actCartPageTitle = cart.getCartPageLogoText();
        Assert.assertEquals(actCartPageTitle, expCartPageTitle, "Act & exp logo text mismatch" );
    }

    @Then("verify quantity of items in Cart should be {int}")
    public void verify_quantity_of_items_in_cart_should_be(Integer expCartQuantity)
    {
        int actCartQuantity = cart.getTotalCartQuantity();
        Assert.assertEquals(actCartQuantity, expCartQuantity, "Act & exp Cart Quantity  mismatch" );

    }


    @Then("verify title of added product is {string}")
    public void verify_title_of_added_product_is(String expProductNameInCart)
    {
        String actProductNameInCart = cart.getCartItemtitle();
        Assert.assertEquals(actProductNameInCart, expProductNameInCart, "Act & exp logo text mismatch" );

    }


    @Then("user clicks on checkout button")
    public void user_clicks_on_checkout_button()
    {
        cart.clickOnCheckoutButton();

    }

    @Then("verify title of Checkout page should be  {string}")
    public void verify_title_of_checkout_page_should_be(String expCheckoutPageTitle)
    {

        String actCheckoutPageTitle = checkout.getCheckoutPageLogoText();
        Assert.assertEquals(actCheckoutPageTitle, expCheckoutPageTitle, "Act & exp title text mismatch" );
    }


    @Then("user enters First Name as {string}")
    public void user_enters_first_name_as(String fnName) {
        checkout.enterFN(fnName);

    }

    @Then("user enters Last Name as {string}")
    public void user_enters_last_name_as(String lnName) {
        checkout.enterLN(lnName);
    }

    @Then("user enters Zip Code as {string}")
    public void user_enters_zip_code_as(String zipCode) {
        checkout.enterZIP(zipCode);
    }

    @Then("user clicks on Continue button")
    public void user_clicks_on_continue_button() {
        checkout.clickOnContinueButton();
    }

    @Then("user clicks on Finish button")
    public void user_clicks_on_finish_button() {
        checkoutoverview.clickOnFinishButton();
    }



    @Then("verify title of Checkout overview page should be  {string}")
    public void verify_title_of_checkout_overview_page_should_be(String expCheckoutOvrPageTitle) {

        String actCheckoutOvrPageTitle = checkoutoverview.getCheckoutOverviewtitle();
        Assert.assertEquals(actCheckoutOvrPageTitle, expCheckoutOvrPageTitle, "Act & exp title text mismatch" );

    }



    @Then("verify title of Checkout complete page should be  {string}")
    public void verify_title_of_checkout_complete_page_should_be(String expCheckoutComPageTitle) {

        String actCheckoutComPageTitle = checkoutcomplete.getCheckoutCompletetitle();
        Assert.assertEquals(actCheckoutComPageTitle, expCheckoutComPageTitle, "Act & exp title text mismatch" );


    }

    @Then("verify order completion message should be as {string}")
    public void verify_order_completion_message_should_be_as(String expCompletionMsg) {

       String actCompletionMsg=  checkoutcomplete.getcompletiontext();
        Assert.assertEquals(actCompletionMsg, expCompletionMsg, "Act & exp message text mismatch" );


    }
}
