package com.framework.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.listeners.RetryAnalyzer;

@CucumberOptions(
        features = "@target/failed_scenarios.txt",
        glue = {"com.framework.stepdefinitions", "com.framework.hooks"},
       
        		   plugin = {"pretty"},
        monochrome = true
)



public class FailedRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
	  @Override
	    @Test( groups = {"cucumber"},
	    	    description = "Runs Cucumber Scenarios",
	    	    dataProvider = "scenarios",
	    		retryAnalyzer = RetryAnalyzer.class) // attach retry here
	  public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
		    super.runScenario(pickleWrapper, featureWrapper);
		}
	 }
   

