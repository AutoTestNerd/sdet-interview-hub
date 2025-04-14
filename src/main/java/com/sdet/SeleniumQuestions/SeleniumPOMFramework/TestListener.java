//package com.sdet.SeleniumQuestions.SeleniumPOMFramework;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//public class TestListener implements ITestListener {
//    @Override
//    public void onTestStart(ITestResult iTestResult) {
//
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult iTestResult) {
//
//    }
//
//    @Override
//    public void onTestFailure(ITestResult iTestResult) {
//          WebDriver driver = DriverFactory.getDriver();
//          String testName = iTestResult.getTestName();
//          if (ITestResult.FAILURE==iTestResult.getStatus()){
//               String screenShotname =iTestResult.getName() + " " +iTestResult.getStartMillis();
//               ScreenshotUtil.takeScreenShot(driver,screenShotname);
//          }
//
//
//
//
//
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult iTestResult) {
//
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
//
//    }
//
//    @Override
//    public void onStart(ITestContext iTestContext) {
//
//    }
//
//    @Override
//    public void onFinish(ITestContext iTestContext) {
//
//    }
//}
