package org.example.swag.labs.automation.stepDefinitions;

import io.cucumber.java.en.Given;
import lombok.AllArgsConstructor;
import org.example.swag.labs.automation.hooks.ChromeWebDriver;

@AllArgsConstructor
public class loginSteps {

    private final ChromeWebDriver driver;

    private static final String swagLabsURL = "https://www.saucedemo.com/v1/";

    @Given("^I login into my account$")
    public void iLogin(){
        driver.navigateToURL(swagLabsURL);
    }
}
