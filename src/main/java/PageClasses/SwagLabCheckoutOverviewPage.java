package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckoutOverviewPage {

    //1: Declaration

    @FindBy(xpath = "//span[@class='title']") private WebElement checkouttitlePage ;
    @FindBy(xpath = "//button[@id='finish']") private WebElement finishButton;
  //  @FindBy(xpath = "//div[@class='inventory_item_name']") private  WebElement cartItemtitle;

    //2:initialization
    public SwagLabCheckoutOverviewPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }



    public String getCheckoutOverviewtitle()
    {
        return checkouttitlePage.getText();
    }
   // Checkout: Overview

    public void clickOnFinishButton ()
    {
        finishButton.click();
    }
}
