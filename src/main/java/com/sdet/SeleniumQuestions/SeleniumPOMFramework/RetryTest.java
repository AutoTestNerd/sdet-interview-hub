package com.sdet.SeleniumQuestions.SeleniumPOMFramework;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {

    int retryCount  =0;
    int max_retry=2;
    @Override
    public boolean retry(ITestResult iTestResult) {

        if (retryCount <=max_retry){
            retryCount ++;
            System.out.println("Retry Test" + iTestResult.getName() + "Attenpt" + retryCount );
            return  true;
        }
        return false;
    }
}
