package Hooks;

import Utilities.LoggerHelper;
import io.cucumber.java.*;
import io.qameta.allure.Allure;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class MyHooks
{
    private static final Logger log = LoggerHelper.getLogger(MyHooks.class);
    public static WebDriver driver;



    @Before
    public void beforeScenario(Scenario scenario) {

        log.info("Scenario started : {}", scenario.getName());

        System.out.println("Before calling method....");
        Allure.step("Browser is opened for scenario: " + scenario.getName());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @After
    public void afterScenario(Scenario scenario) {

       if(scenario.isFailed())
       {
           log.error("scenario Failed : {}", scenario.getName());
           attachScreenshot();
           Allure.step("Scenario failed: " + scenario.getName());
       }
       else
       {
           log.info("Scenario passed : {}", scenario.getName());

           Allure.step("Scenario passed: " + scenario.getName());
       }
        driver.quit();
    }

    private void attachScreenshot() {
        if (driver != null) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Screenshot", "image/png", new java.io.ByteArrayInputStream(screenshot), ".png");
        }
    }


}
