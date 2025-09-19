package com.framework.pages;

import com.framework.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By loginBtn = By.cssSelector("button[type='submit']");
    private final By flash = By.id("flash");

    public LoginPage(WebDriver driver, long explicitWaitSeconds) {
        super(driver, explicitWaitSeconds);
    }

    public void goTo(String baseUrl) 
    { openUrl(baseUrl + "/login"); }

    public void login(String user, String pass) {
        type(username, user);
        type(password, pass);
        click(loginBtn);
    }

    public String getFlashMessage() {
        return getText(flash);
    }
}
