package testing.Selenium;

import main.java.source.core.DriverWrapper;
import main.java.source.googlePages.googleHomeSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class selenium4Test extends seleniumBaseTest{
    @Test
    public void TestingChromeAndSeleniumBasic(){

        Assert.assertEquals(true,true);
    }
    @Test
    public void testingChromeSearch(){
        log.info("Start of test");
        String title =
                new googleHomeSearchPage()
                        .setTextToSearchField("Vietnam")
                        .clickGoogleSearchButton()
                        .getTitle();
        Assert.assertTrue(title.contains("Vietnam"));
        log.info("Finish");
    }
    @Test
    public void testChromeDoodle(){
        Assert.assertTrue(new googleHomeSearchPage()
                .clickGoogleDoodleButton()
                .getTitle()
                .contains("Doodles"));
    }
    @Test
    public void testGoogleLanguage() {
        Assert.assertTrue(new googleHomeSearchPage().getGoogleLanguage().getText().contains("Nam"));
    }
    @Test
    public void testGoogleApplication(){
        Assert.assertTrue(new googleHomeSearchPage().getGoogleGmail().getUrl().contains("mail"));
    }
    @Test
    public void testGithub() throws InterruptedException {
        DriverWrapper.getDriver().navigate().to("https://github.com/tungrg/calculator");
        WebElement application = DriverWrapper.getDriver().findElement(new By.ByCssSelector("#issues-tab > span:nth-child(2)"));
        application.click();
        Thread.sleep(5000);
        WebElement issue = DriverWrapper.getDriver().findElement((new By.ByCssSelector("#js-issues-search")));
        Assert.assertTrue(issue.isDisplayed());
        DriverWrapper.getDriver().quit();
    }
    @Test
    public void testGoogleImage (){
        DriverWrapper.getDriver().navigate().to("https://google.com");
        WebElement imageButton = DriverWrapper.getDriver().findElement(new By.ByCssSelector("#gb > div > div:nth-child(1) > div > div:nth-child(2) > a"));
        imageButton.click();
        WebElement imageLogo = DriverWrapper.getDriver().findElement(new By.ByCssSelector("#hplogo"));
        Assert.assertTrue(imageLogo.isDisplayed());
        DriverWrapper.getDriver().quit();
    }
    @Test
    public void testGooglePrivacyButton(){
        Assert.assertTrue(new googleHomeSearchPage().clickGooglePrivacyButton().getUrl().contains("privacy"));
    }
    @Test
    public void testGoogleTermButton(){
        Assert.assertTrue(new googleHomeSearchPage().clickGoogleTermButton().getUrl().contains("term"));
    }
    @Test
    public void testGoogleAdsButton(){
        Assert.assertTrue(new googleHomeSearchPage().clickGoogleAdsButton().getUrl().contains("ads"));
    }
    @Test
    public void testGoogleSearchImage(){
        DriverWrapper.getDriver().navigate().to("https://google.com");
        WebElement search = DriverWrapper.getDriver().findElement(new By.ByClassName("gLFyf"));
        search.sendKeys("pokemon");
        search.sendKeys(Keys.ENTER);
        WebElement moreImage = DriverWrapper.getDriver().findElement(new By.ByCssSelector("#media_result_group > div > div > a"));
        Assert.assertTrue(moreImage.isDisplayed());
        DriverWrapper.getDriver().quit();
    }
}
