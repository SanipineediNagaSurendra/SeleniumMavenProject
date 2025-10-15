package StepDefinitions;

import POM.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registerstepdef {

    RegisterPage page = new RegisterPage();

    @Given("User is on the Demo Web Shop homepage {string}")
    public void userIsOnTheDemoWebShopHomepage(String arg0) {

        page.openHomePage(arg0);
    }

    @When("User clicks on the {string} link")
    public void userClicksOnTheLink(String arg0) {

        page.SafeClickHomeTab(arg0);


    }

    @Then("User should be navigated to the Register page")
    public void userShouldBeNavigatedToTheRegisterPage() {

        page.VerifyWindowTitle();
    }

    @And("User selects the gender {string}")
    public void userSelectsTheGender(String arg0) {
      page.SafeClickGenderRadioButton(arg0);



    }

    @And("User enters the First Name {string}")
    public void userEntersTheFirstName(String arg0) {

        page.EnterTheFullName(arg0);
    }

    @And("User enters the Last Name {string}")
    public void userEntersTheLastName(String arg0) {

        page.EnterTheLastName(arg0);

    }

    @And("User enters the Email {string}")
    public void userEntersTheEmail(String arg0) {

        page.EnterTheUserEmail(arg0);
    }

    @And("User enters the Password {string}")
    public void userEntersThePassword(String arg0) throws InterruptedException {

        page.EnterTheUserPassword(arg0);

            Thread.sleep(5000);

    }

    @And("User enters the Confirm Password {string}")
    public void userEntersTheConfirmPassword(String arg0) throws InterruptedException {

        page.EnterTheConfirmPassword(arg0);

            Thread.sleep(5000);

    }

    @And("User clicks on the {string} button")
    public void userClicksOnTheButton(String arg0) throws InterruptedException {
       page.SafeClickRegisterButton(arg0);

            Thread.sleep(5000);

    }

    @Then("User should verify the text {string}")
    public void userShouldVerifyTheText(String arg0) {

        page.ValidateActualAsExpected(arg0);
    }
}
