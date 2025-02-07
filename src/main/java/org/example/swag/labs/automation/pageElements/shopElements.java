package org.example.swag.labs.automation.pageElements;

import org.example.swag.labs.automation.hooks.ChromeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class shopElements {

    public WebElement getShoppingCart(){
        return ChromeWebDriver.getWebDriver().findElement(By.cssSelector("[data-icon='shopping-cart]"));
    }
}
