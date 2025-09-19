package com.framework.pages;

import com.framework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {

    private final By header = By.cssSelector("div.example h2");

    public DashboardPage(WebDriver driver, long explicitWaitSeconds) {
        super(driver, explicitWaitSeconds);
    }

    public String getHeader() {
        return getText(header);
    }
}
