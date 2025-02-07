package org.example.swag.labs.automation.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;
import org.example.swag.labs.automation.utils.FileReader;

@AllArgsConstructor
public class shopSteps {

    private final FileReader properties;

    @And("^I search for the first lower price product$")
    public void iSearchFirstLowerPriceProduct(){

    }

    @Then("^I add the product to the basket$")
    public void iAddAProductToBasket(){

    }

    @And("^I confirm the product is in the basket$")
    public void iConfirmProductsIsInBasket(){

    }

    @Given("^I have (\\d+) apples$") //example with regex and multiple option entry
    public void i_have_apples(int appleCount) {
        this.apples = appleCount;
    }
}
