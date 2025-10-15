package POM;

import Helpers.ControlHelpers;
import Hooks.MyHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPage {

    private final ControlHelpers _controlHelpers;
    private WebDriver driver = MyHooks.driver;

    public RegisterPage()
    {
        _controlHelpers = new ControlHelpers();
    }

    protected By RegisterTab(String tab)
    {
        return By.xpath("//a[text() = '"+tab+"']");
    }

    protected By GenderSelection(String gender)
    {
        return By.xpath("//label[text() = '"+ gender +"']/preceding-sibling::input[@type = 'radio']");
    }

    protected By EnterTheName()
    {
        return By.id("FirstName");
    }
    protected By LastName()
    {
        return By.id("LastName");
    }

    protected By EnterEmail()
    {
        return By.id("Email");
    }

    protected By EnterThePassword()
    {
        return By.id("Password");
    }

    protected By EnterConfirmPassword()
    {
        return By.id("ConfirmPassword");
    }

    protected By SubmitTheRegisterForm(String btn)
    {
        return By.xpath("//input[@value = '"+btn+"']");
    }

    protected By VerifyTheTextAsExpected()
    {
        return By.xpath("//div[@class = 'page-body']/div[@class = 'result']");
    }

    public void openHomePage(String url)
    {
        _controlHelpers.SendUrl(url);
    }

    public void SafeClickHomeTab(String tab)
    {
        _controlHelpers.SafeClick(RegisterTab(tab));
    }

    public void VerifyWindowTitle()
    {

        String actual = driver.getTitle();

        String expected = "Demo Web Shop. Register";

        Assert.assertEquals(actual, expected, "Actual title is matched as expected");
    }

    public void SafeClickGenderRadioButton(String gender)
    {
        _controlHelpers.SafeClick(GenderSelection(gender));
    }

    public void EnterTheFullName(String firstname)
    {
        _controlHelpers.EnterText(EnterTheName(), firstname);
    }
    public void EnterTheLastName(String lastname)
    {
        _controlHelpers.EnterText(LastName(), lastname);
    }

    public void EnterTheUserEmail(String email)
    {
        _controlHelpers.EnterText(EnterEmail(), email);
    }

    public void EnterTheUserPassword(String password)
    {
            _controlHelpers.EnterText(EnterThePassword(), password);
    }

    public void EnterTheConfirmPassword(String confirmpassword)
    {
        _controlHelpers.EnterText(EnterConfirmPassword(), confirmpassword);
    }

    public void SafeClickRegisterButton(String btn)
    {
        _controlHelpers.SafeClick(SubmitTheRegisterForm(btn));
    }

    public void ValidateActualAsExpected(String expected)
    {
        var ele = _controlHelpers.FindElement(VerifyTheTextAsExpected());

        String actual = ele.getText();

        Assert.assertEquals(actual, expected, "Both actual and expected texts are equal..");


    }
}
