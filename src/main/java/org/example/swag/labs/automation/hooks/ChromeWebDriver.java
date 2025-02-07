package org.example.swag.labs.automation.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWebDriver {

    static WebDriver webDriver;

    @Before
    public void beforeScenario(Scenario scenario){
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
    public void afterScenario(Scenario scenario){
        if (webDriver != null){
            webDriver.close();
            webDriver.quit();
            webDriver = null;
        }

    }

    public void navigateToURL(String url){
        webDriver.get(url);
    }

}
