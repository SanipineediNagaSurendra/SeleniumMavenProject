package POM;

import Helpers.ControlHelpers;
import Hooks.MyHooks;
import io.cucumber.java.et.Ja;
import org.openqa.selenium.*;
import org.testng.Assert;

public class LoginPage {

    private final ControlHelpers _controlHelpers;

    public LoginPage()
    {
        _controlHelpers = new ControlHelpers();
    }

    protected By RememberMeCheckbox(String remindme)
    {
        return By.xpath("//label[text() = '"+remindme+"']");
    }

     protected By ScrollAndClickTheProduct(String element)
     {
         return By.xpath("//h2[@class = 'product-title']/a[text() = '"+element+"']");
     }
     protected  By VerifyProductIsAddedInCartOrNot()
     {
         return By.cssSelector(".bar-notification.success p");
     }
     protected By EnterRecipientName()
     {
         return By.id("giftcard_2_RecipientName");
     }

     protected By EnterRecipientEmail()
     {
         return By.id("giftcard_2_RecipientEmail");
     }

     protected By SafeClickCartButton(String btn)
     {
         return By.xpath("//input[@value = '"+btn+"']");
     }

    public void SafeClickRemindMeCheckbox(String checkbox)
    {
        _controlHelpers.SafeClick(RememberMeCheckbox(checkbox));
    }

    public void ScrollAndClickUntilElementFound(String element) {
        WebElement ele = _controlHelpers.FindElement(ScrollAndClickTheProduct(element));

        if (ele.isDisplayed()) {
            ele.click();

        } else {

            _controlHelpers.ScrollAndClickElement(ele);
        }

    }

    public void EnterRecipientsUserName(String name)
    {
        _controlHelpers.EnterText(EnterRecipientName(), name);
    }

    public void EnterRecipientsUserEmail(String email)
    {
        _controlHelpers.EnterText(EnterRecipientEmail(), email);
    }

    public void SafeClickAddToCartButton(String btn)
    {
        _controlHelpers.SafeClick(SafeClickCartButton(btn));
    }

    public void VerifyProductIsAddedInShoppingCartOrNot(String expectedMessage) {

        WebElement successMsg = _controlHelpers.FindElement(VerifyProductIsAddedInCartOrNot());
        String actualMessage = successMsg.getText();


    }
}

