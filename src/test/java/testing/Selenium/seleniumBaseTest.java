package testing.Selenium;

import testing.BaseTest;
import main.java.source.core.DriverWrapper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class seleniumBaseTest extends BaseTest {
    @BeforeMethod
    public void preCondition(){
        DriverWrapper.getDriver().navigate().to("https://google.com");
    }
    @AfterMethod
    public void postCondition(){
        DriverWrapper.getDriver().quit();
    }
}
