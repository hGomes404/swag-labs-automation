package org.example.swag.labs.automation.stepDefinitions;

import io.cucumber.java.en.Given;
import lombok.AllArgsConstructor;
import org.example.swag.labs.automation.hooks.ChromeWebDriver;
import org.example.swag.labs.automation.pageElements.loginElements;
import org.example.swag.labs.automation.utils.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@AllArgsConstructor
public class loginSteps {

    private final ChromeWebDriver driver;

    private final FileReader properties;

    private final loginElements loginElements;

    @Given("^I navigate to Swag Labs website$")
    public void iNavigateToWebsite(){
        driver.navigateToURL(properties.getApplicationUrl());
    }

    @Given("^I login using (standard|locked out|problem|performance glitch) user$")
    public void iLogin(String username){
        if(loginElements.getLoginButton().isDisplayed()){
            loginElements.getUsernameField().sendKeys(loginElements.getUser(username));
            loginElements.getPasswordField().sendKeys(properties.getPassword());
            loginElements.getLoginButton().click();
        }
    }
}
