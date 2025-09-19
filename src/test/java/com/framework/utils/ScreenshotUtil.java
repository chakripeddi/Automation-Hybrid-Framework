package com.framework.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    public static byte[] takeScreenshot(WebDriver driver) {
        byte[] scnrshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS").format(new Date());
//        String path = "target/screenshots/" + name + "_" + timestamp + ".png";
//        try {
//            Files.createDirectories(Paths.get("target/screenshots"));
//            Files.copy(src.toPath(), Paths.get(path));
//        } catch (IOException e) {
//            throw new RuntimeException("Failed to save screenshot", e);
//        }
        return scnrshot;
    }
}
