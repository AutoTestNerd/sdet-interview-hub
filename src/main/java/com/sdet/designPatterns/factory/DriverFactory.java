package com.sdet.designPatterns.factory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static BrowserDriver getDriver(String browserType) {

        switch (browserType.toLowerCase()){
            case "chrome":
                return new ChromeDriverManger();

            case "firefox":
                return new FirefoxDriverManager();
            case "edge":
                return new EdgeDriverManager();

            default:
                throw new IllegalArgumentException("Unsuppoeted Browser" +browserType);

        }
    }
}
