package com.sdet.SeleniumQuestions.SeleniumPOMFramework;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestRetryListner implements IRetryAnalyzer {

    private int  retryCount=0;
    private  int MaxRetryCOunt =3;
    @Override
    public boolean retry(ITestResult iTestResult) {

        if(retryCount<MaxRetryCOunt){
            retryCount++;
            return true;
        }
        return false;
    }
}
