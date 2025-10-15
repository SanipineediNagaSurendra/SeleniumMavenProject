package StepDefinitions;

import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginStepDef {

    LoginPage login = new LoginPage();

    @And("User clicks on the Checkbox {string}")
    public void userClicksOnTheCheckbox(String arg0) {

        login.SafeClickRemindMeCheckbox(arg0);
    }

    @And("User should scroll and select the product {string} into the add to cart")
    public void userShouldScrollAndSelectTheProductIntoTheAddToCart(String arg0) {
        login.ScrollAndClickUntilElementFound(arg0);

        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @And("User enters the Recipient name {string}")
    public void userEntersTheRecipientName(String arg0) {

        login.EnterRecipientsUserName(arg0);
    }

    @And("User enter the Recipient email {string}")
    public void userEnterTheRecipientEmail(String arg0) {

        login.EnterRecipientsUserEmail(arg0);

    }
    @And("User click on the {string} button")
    public void userClickOnTheButton(String arg0) {

        login.SafeClickAddToCartButton(arg0);
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Then("User should verify the message {string}")
    public void userShouldVerifyTheMessage(String arg0) {

        login.VerifyProductIsAddedInShoppingCartOrNot(arg0);
    }
}
