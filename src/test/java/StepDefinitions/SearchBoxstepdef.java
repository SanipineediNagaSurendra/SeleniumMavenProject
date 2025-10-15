package StepDefinitions;

import POM.SearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBoxstepdef {

    SearchPage searchPage = new SearchPage();

    @When("User searches for {string}")
    public void userSearchesFor(String arg0) throws InterruptedException {

      searchPage.EnterTheTextInSearchBox(arg0);

            Thread.sleep(5000);

    }

    @Then("Search results should contain {string}")
    public void searchResultsShouldContain(String arg0) {

        searchPage.VerifySearchProductContainOrNot(arg0);
    }
}
