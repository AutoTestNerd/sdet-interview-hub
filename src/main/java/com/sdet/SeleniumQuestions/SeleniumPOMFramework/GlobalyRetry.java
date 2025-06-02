package com.sdet.SeleniumQuestions.SeleniumPOMFramework;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class GlobalyRetry implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
       IRetryAnalyzer retry=  iTestAnnotation.getRetryAnalyzer();
       if(retry==null){
           iTestAnnotation.setRetryAnalyzer(RetryTest.class);
       }
    }
}
//Add this listenr into TestNg XML/