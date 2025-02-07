package org.example.swag.labs.automation.pageElements;

import lombok.AllArgsConstructor;
import org.example.swag.labs.automation.hooks.ChromeWebDriver;
import org.example.swag.labs.automation.utils.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@AllArgsConstructor
public class loginElements {

    private final ChromeWebDriver driver;

    private final FileReader properties;

    public WebElement getUsernameField(){
        return ChromeWebDriver.getWebDriver().findElement(By.cssSelector("[data-test='username']"));
    }

    public String getUser(String username){
       return switch (username){
           case "standard" -> properties.getStandardUser();
           case "locked out" -> properties.getLockedOutUser();
           case "problem" -> properties.getProblemUser();
           case "performance glitch" -> properties.getPerformanceGlitchUser();
           default -> throw new RuntimeException("Unknown user");
        };
    }

    public WebElement getPasswordField(){
        return ChromeWebDriver.getWebDriver().findElement(By.cssSelector("[data-test='password']"));
    }

    public WebElement getLoginButton(){
        return ChromeWebDriver.getWebDriver().findElement(By.cssSelector("[id='login-button']"));
    }

}
