package main.java.source.googlePages;

import main.java.source.core.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class googleHomeSearchPage extends baseGooglePage{
    private WebElement googleSearchField = DriverWrapper.getDriver().findElement(By.className("gLFyf"));
    private WebElement googleSearchButton = DriverWrapper.getDriver().findElement(By.name("btnK"));
    //private WebElement googleDoodleButton   = DriverWrapper.getDriver().findElement(By.className(""));
    private WebElement googleDoodleButton = DriverWrapper.getDriver().findElement(new By.ByXPath("//div[@class=\"FPdoLc lJ9FBc\"]//input[@name=\"btnI\"]"));
    private WebElement googleLanguage = DriverWrapper.getDriver().findElement(By.className("uU7dJb"));
    private WebElement googleGmail          = DriverWrapper.getDriver().findElement(By.className("gb_f"));
    private WebElement googlePrivacyButton  = DriverWrapper.getDriver().findElement(new By.ByXPath("//div[@class=\"KxwPGc iTjxkf\"]//a[@class=\"pHiOh\"]"));
    private List<WebElement> googleTermButton   = DriverWrapper.getDriver().findElements(new By.ByXPath("//div[@class=\"KxwPGc iTjxkf\"]//a[@class=\"pHiOh\"]"));
    private List<WebElement> googleAdsButton    = DriverWrapper.getDriver().findElements(new By.ByXPath("//div[@class=\"KxwPGc AghGtd\"]//a[@class=\"pHiOh\"]"));
    public googleHomeSearchPage setTextToSearchField(String text){
        googleSearchField.sendKeys(text);
        try{
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }
    public googleSearchResultPage clickGoogleSearchButton(){
        googleSearchButton.click();
        return new googleSearchResultPage();
    }
    public googleSearchResultPage clickGoogleDoodleButton(){
        googleDoodleButton.click();
        return new googleSearchResultPage();
    }
    public WebElement getGoogleLanguage(){
        return this.googleLanguage;
    }
    public googleSearchResultPage getGoogleGmail(){
         googleGmail.click();
         return new googleSearchResultPage();
    }
    public googleSearchResultPage clickGooglePrivacyButton(){
       googlePrivacyButton.click();
       return new googleSearchResultPage();
    }
    public googleSearchResultPage clickGoogleTermButton(){
        //result is index 1
        googleTermButton.get(1).click();
        return new googleSearchResultPage();
    }
    public googleSearchResultPage clickGoogleAdsButton(){
        //result is index 1
        googleAdsButton.get(1).click();
        return new googleSearchResultPage();
    }
}
