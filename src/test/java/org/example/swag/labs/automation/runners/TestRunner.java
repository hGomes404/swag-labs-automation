package org.example.swag.labs.automation.runners;
import io.cucumber.junit.CucumberOptions;
import org.apache.commons.lang3.StringUtils;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import java.security.InvalidParameterException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue={
                "org.example.swag.labs.automation.stepDefinitions",
                "org.example.swag.labs.automation.hooks"
        },
        plugin = {
                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber-json-report.json"
//                "com.epam.reportportal.cucumber.ScenarioReporter",
        }
)

public class TestRunner {

//    @BeforeClass
//    public static void setUpBeforeClass(){
//        if(StringUtils.isEmpty(System.getProperty("env"))){
//            throw new InvalidParameterException("No environment specified");
//        }
//    }

}
