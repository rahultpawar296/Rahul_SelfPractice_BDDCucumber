package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SwagLabCartPage {

    //1: Declaration
    @FindBy(xpath = "//button[@id='checkout']") private WebElement checkoutButton;
    @FindBy(xpath = "//span[@class='title']") private WebElement titleCartPage ;
    @FindBy(xpath = "//div[@class='cart_quantity']") private WebElement totalCartQuantity;
    @FindBy(xpath = "//div[@class='inventory_item_name']") private  WebElement cartItemtitle;

    //2:initialization
    public SwagLabCartPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }



    public String getCartPageLogoText()
    {
        return titleCartPage.getText();
    }

    public void clickOnCheckoutButton ()
    {
        checkoutButton.click();
    }

    public String getTotalCartQuantity()
    {
        return totalCartQuantity.getText();
    }

    public String getCartItemtitle()
    {
        return cartItemtitle.getText();
    }

}
