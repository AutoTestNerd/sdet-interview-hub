package com.sdet.SeleniumQuestions.SeleniumPOMFramework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

    public static   void takeScreenShot(WebDriver driver ,String testName){

           TakesScreenshot ts = (TakesScreenshot)driver;
           File source =ts.getScreenshotAs(OutputType.FILE);
           File dest = new File("/Screenshot" + testName + ".png" );

        try {
            FileUtils.copyFile(source,dest);
            System.out.println("Screenshot taken: " + testName);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
