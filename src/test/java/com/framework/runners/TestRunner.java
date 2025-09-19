package com.framework.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.listeners.RetryAnalyzer;

@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = {"com.framework.stepdefinitions", "com.framework.hooks"},
       
        plugin = { "rerun:target/failed_scenarios.txt"},
        monochrome = true
)



public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	 }
   

