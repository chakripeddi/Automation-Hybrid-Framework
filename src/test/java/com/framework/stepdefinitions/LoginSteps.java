package com.framework.stepdefinitions;

import com.framework.driver.DriverFactory;
import com.framework.pages.LoginPage;
import com.framework.utils.ConfigReader;
import com.framework.utils.Log;
import com.framework.utils.TestDataUtil;
import com.framework.utils.TestListener;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LoginSteps {

    private WebDriver driver = DriverFactory.getDriver();
    private final long waitTime = Long.parseLong(ConfigReader.get("explicitWait"));
    private LoginPage loginPage;
	

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver, waitTime);
        loginPage.goTo(ConfigReader.get("baseUrl"));
    }

    @When("^user logs in with excel sheet (.*) and (.*)$")
    public void user_logs_in_with_excel_sheet(String userr, String passs) throws IOException {
    	
    	String data[][] =TestDataUtil.getData();
    	String user =data[0][0];
		String pass =data[0][1];
        loginPage.login(user, pass);
        Assert.assertTrue(false);
    }


    @Then("flash message should contain {string}")
    public void flash_message_should_containn(String expected) {
    

        String actual = loginPage.getFlashMessage();
        Assert.assertTrue(actual.contains(expected), "Expected flash to contain: " + expected + " but got: " + actual);
    }
}
