package org.example.swag.labs.automation.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWebDriver {

    static WebDriver webDriver;

    @Before
    public void init(){
       getWebDriver();
    }

    public static WebDriver getWebDriver(){
        if(webDriver == null){

            ChromeOptions options = getChromeOptions();
            webDriver = new ChromeDriver(options);
            webDriver.manage().deleteAllCookies();

        }
        return webDriver;
    }

    private static ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--allow-running-insecure-content");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        return chromeOptions;
    }

    @After
    public void teardown(){
        webDriver.quit();
    }

    public void navigateToURL(String url){
        webDriver.get(url);
    }
}
