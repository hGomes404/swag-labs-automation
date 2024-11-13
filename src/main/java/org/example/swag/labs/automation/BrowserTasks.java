package org.example.swag.labs.automation;

public class BrowserTasks {

    private final ChromeWebDriver webDriver;

    public BrowserTasks(ChromeWebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void navigateToURL(String url){
        webDriver.createWebDriver().get(url);
    }

    public void captureScreenshot(){

    }
}
