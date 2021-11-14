package com.amazon.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/amazon/stepDefinition",
        dryRun = false,
        tags =""
)

public class TestRunner {


}
