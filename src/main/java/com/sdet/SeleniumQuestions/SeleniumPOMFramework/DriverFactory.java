package com.sdet.SeleniumQuestions.SeleniumPOMFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public  static  WebDriver initDriver(){

        String browser = ConfigReader.getConfig("browser");
        switch (browser){

            case "firefox":

                WebDriverManager.firefoxdriver().setup();
                tlDriver.set(new FirefoxDriver());
                break;
            case  "chrome":

                WebDriverManager.chromedriver().setup();
                tlDriver.set(new ChromeDriver());
                break;
            default:
                throw  new IllegalArgumentException("Not supoorting browse");
        }

       getDriver().manage().window().maximize();
   return getDriver();
    }
    public static WebDriver getDriver() {
        return tlDriver.get();
    }
    public static void quitDriver() {
        if (tlDriver.get() != null) {
            tlDriver.get().quit();
            tlDriver.remove();
        }
    }
}
