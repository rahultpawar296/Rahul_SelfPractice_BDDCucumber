package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckoutPage {



        //1: Declaration
        @FindBy(xpath = "//input[@placeholder='First Name']") private WebElement firstNameTxtfield;
        @FindBy(xpath = "//span[@class='title']") private WebElement titleCheckoutPage ;
        @FindBy(xpath = "//input[@placeholder='Last Name']") private WebElement lastNameTxtfield;
        @FindBy(xpath = "//input[@placeholder='Zip/Postal Code']") private  WebElement zipcodeTxtfield;

        @FindBy(xpath = "//input[@type='submit']") private  WebElement continuebutton;


        //2:initialization
        public SwagLabCheckoutPage(WebDriver driver)
        {
            PageFactory.initElements(driver, this);
        }



        public String getCheckoutPageLogoText()
        {
            return titleCheckoutPage.getText();
        }

    public void enterFN(String FNValue)
    {
        firstNameTxtfield.sendKeys(FNValue);
    }

    public void enterLN(String LNValue)
    {
        lastNameTxtfield.sendKeys(LNValue);
    }

    public void enterZIP(String ZIPValue)
    {
        zipcodeTxtfield.sendKeys(ZIPValue);
    }

    public void clickOnContinueButton ()
    {
        continuebutton.click();
    }

}
