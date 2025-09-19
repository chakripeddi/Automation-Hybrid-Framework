package com.framework.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

public class Log {
	Logger logger = LogManager.getLogger(Log.class);
	

    public static void logInfo(String message) {
        ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, message);
    }

    public static void logWarning(String message) {
        ExtentCucumberAdapter.getCurrentStep().log(Status.WARNING, message);
    }

   

    public static void logPass(String message) {
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, message);
    }

    public static void logFail(String message) {
        ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, message);
    }
}


