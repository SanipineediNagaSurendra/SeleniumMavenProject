package POM;

import Helpers.ControlHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchPage {

    private final ControlHelpers _controlHelpers;

    public SearchPage()
    {
        _controlHelpers = new ControlHelpers();
    }

    protected By SearchTextBox()
    {
        return By.xpath("//input[@class = 'search-box-text ui-autocomplete-input']");
    }

    protected By VerifyContainsSameProductOrNot()
    {
        return By.xpath("//h2[@class = 'product-title']/a");
    }

    public void EnterTheTextInSearchBox(String element)
    {
        _controlHelpers.EnterText(SearchTextBox(), element +Keys.ENTER);
    }

    public void VerifySearchProductContainOrNot(String element)
    {
        var actual = _controlHelpers.FindElement(VerifyContainsSameProductOrNot());

        String ele = actual.getText();

        Assert.assertEquals(ele, element, "Both are not matching");
    }
}
