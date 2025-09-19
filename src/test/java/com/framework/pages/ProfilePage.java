package com.framework.pages;

import com.framework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage {

    private final By heading = By.tagName("h1");

    public ProfilePage(WebDriver driver, long explicitWaitSeconds) {
        super(driver, explicitWaitSeconds);
    }

    public String getHeading() { return getText(heading); }
}
