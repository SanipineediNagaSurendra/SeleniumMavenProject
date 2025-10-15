package Helpers;

import Hooks.MyHooks;
import io.cucumber.java.et.Ja;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ControlHelpers {

    public WebDriver driver = MyHooks.driver;

    public WebElement FindElement(By locator)
    {
        return driver.findElement(locator);
    }

    public List<WebElement> FindElements(By locator)
    {
        return driver.findElements(locator);
    }

    public void SafeClick(By locator)
    {
        FindElement(locator).click();
    }

    public void EnterText(By locator, String text)
    {
        FindElement(locator).sendKeys(text);
    }

    public void SendUrl(String url)
    {
        driver.get(url);
    }

    public void ScrollAndClickElement(WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void ScrollAndFoundElement()
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("window.scrollBy(0, 400)");
    }
}
