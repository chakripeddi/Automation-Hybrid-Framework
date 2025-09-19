package com.framework.driver;

import com.framework.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class DriverFactory {
    private static ThreadLocal <WebDriver> driver = new ThreadLocal<>();
   private DriverFactory () {
   }
    public static void initDriver() {
        String browser = ConfigReader.get("browser");
        boolean headless = Boolean.parseBoolean(System.getProperty("headless"));
        int implicit = Integer.parseInt(ConfigReader.get("implicitWait"));

        if ("chrome".equalsIgnoreCase(browser)) {
            ChromeOptions options = new ChromeOptions();
            if (headless) options.addArguments("--headless=new");
            options.addArguments("--start-maximized");
            driver.set(new ChromeDriver(options));
        } else {
            throw new RuntimeException("Unsupported browser: " + browser);
        }
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(implicit));
    }

    public static WebDriver getDriver() {	
    	//returns the driver    	
        return driver.get();
    }

    public static void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove();
        }
    }
}
