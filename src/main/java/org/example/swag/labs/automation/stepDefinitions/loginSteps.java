package org.example.swag.labs.automation.stepDefinitions;

import io.cucumber.java.en.Given;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.swag.labs.automation.BrowserTasks;

@AllArgsConstructor
public class loginSteps {

    private final BrowserTasks browserTasks;

    private static final String swagLabsURL = "https://www.saucedemo.com/v1/";

    @Given("^I login into my account$")
    public void iLogin(){
        browserTasks.navigateToURL(swagLabsURL);
    }
}
