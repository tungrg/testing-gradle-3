package main.java.source.googlePages;

import main.java.source.core.DriverWrapper;

public class googleSearchResultPage extends baseGooglePage {
    public String getTitle(){
        return DriverWrapper.getDriver().getTitle();
    }
    public String getUrl(){
        return DriverWrapper.getDriver().getCurrentUrl();
    }
}
