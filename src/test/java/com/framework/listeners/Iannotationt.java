package com.framework.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Iannotationt implements IAnnotationTransformer {

	
	@Override
    public void transform(ITestAnnotation annotation,
                          Class testClass,
                          Constructor testConstructor,
                          Method testMethod) {

        // Example: set retry analyzer dynamically
        annotation.setRetryAnalyzer(com.framework.listeners.RetryAnalyzer.class);

        // Example: change timeout if not already set
        if (annotation.getTimeOut() == 0) {
            annotation.setTimeOut(30000); // 30 seconds
        }

        // Example: change enabled flag
        // annotation.setEnabled(false); // disables all tests dynamically
    }
	
}
