package com.framework.runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features", "src/test/resources/features/login.feature"},
        glue = {"com.framework.stepdefinitions", "com.framework.hooks"},
        tags = "@regression",
        plugin = {
                "pretty",
                "html:target/cucumber-regression.html",
                "json:target/cucumber-regression.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true
)
public class RegressionRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
}
