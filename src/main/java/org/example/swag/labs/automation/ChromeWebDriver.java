package org.example.swag.labs.automation;

import io.cucumber.java.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWebDriver {

    private ChromeOptions chromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--allow-running-insecure-content");
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        return chromeOptions;
    }

    public WebDriver createWebDriver(){
        return new ChromeDriver(chromeOptions());
    }

    @AfterAll
    private void destroyWebDriver(){
        createWebDriver().quit();
    }
}
