package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckoutComplete {

    //1: Declaration

    @FindBy(xpath = "//span[@class='title']") private WebElement checkoutComptitlePage ;
    @FindBy(xpath = "//h2[@class='complete-header']") private WebElement completeMessageTxt;
    //  @FindBy(xpath = "//div[@class='inventory_item_name']") private  WebElement cartItemtitle;

    //2:initialization
    public SwagLabCheckoutComplete(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }



    public String getCheckoutCompletetitle()
    {
        return checkoutComptitlePage.getText();
    }
    // Checkout: Overview

    public String getcompletiontext ()
    {
       return completeMessageTxt.getText();
    }
    //
}
