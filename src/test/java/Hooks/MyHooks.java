package Hooks;

import Utilities.LoggerHelper;
import io.cucumber.java.*;
import org.apache.logging.log4j.Logger;
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

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @After
    public void afterScenario(Scenario scenario) {

       if(scenario.isFailed())
       {
           log.error("scenario Failed : {}", scenario.getName());
       }
       else
       {
           log.info("Scenario passed : {}", scenario.getName());
       }
        driver.quit();
    }




}
