package com.framework.hooks;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.framework.driver.DriverFactory;
import com.framework.utils.Log;
import com.framework.utils.ConfigReader;
import com.framework.utils.ScreenshotUtil;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import com.framework.utils.*;

public class ApplicationHooks {

    @Before(order = 0)
    public void loadConfig() {
        ConfigReader.load();
    }

    @Before(order = 1)
    public void startDriver() {
	
		

    	
        DriverFactory.initDriver();
    }
@AfterStep
    public void failedcase(Scenario scenario) {
	WebDriver driver= DriverFactory.getDriver();
	
		
		
		byte[] bytee= ScreenshotUtil.takeScreenshot(driver);
		
		scenario.attach(bytee, "image/png", scenario.getName());
	
    	
    }
    	
    @After
    public void tearDown(Scenario scenario) {
    	
        DriverFactory.quitDriver();
    }
}
