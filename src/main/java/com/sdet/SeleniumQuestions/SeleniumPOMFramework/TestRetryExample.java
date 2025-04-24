package com.sdet.SeleniumQuestions.SeleniumPOMFramework;

import org.testng.annotations.Test;

public class TestRetryExample {

    @Test(retryAnalyzer = TestRetryListner.class)
    public void testLogin(){
        System.out.println("Running Test Login");
        assert false;
    }
}
