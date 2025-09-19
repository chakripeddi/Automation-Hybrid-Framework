package com.framework.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    // ThreadLocal to store retry count for each thread separately
    private ThreadLocal<Integer> retryCount = ThreadLocal.withInitial(() -> 0);

    private static final int maxRetryCount = 2; 

    @Override
    public boolean retry(ITestResult result) {
        int currentRetry = retryCount.get();
        if (currentRetry < maxRetryCount) {
            retryCount.set(currentRetry + 1);
            return true; // Retry the test
        }
        return false; // Do not retry anymore
    }
}
