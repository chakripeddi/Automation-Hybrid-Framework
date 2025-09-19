package com.framework.stepdefinitions;

import com.framework.driver.DriverFactory;
import com.framework.pages.DashboardPage;
import com.framework.utils.ConfigReader;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProfileSteps {

    private WebDriver driver = DriverFactory.getDriver();
    private final long waitTime = Long.parseLong(ConfigReader.get("explicitWait"));

    @Then("dashboard header should be {string}")
    public void dashboard_header_should_be(String expected) {
        DashboardPage dashboardPage = new DashboardPage(driver, waitTime);
        Assert.assertEquals(dashboardPage.getHeader(), expected);
    }
}
