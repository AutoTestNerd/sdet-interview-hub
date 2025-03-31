package com.sdet.designPatterns.Singleton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonWithParallelExecution {

    private static SingletonWithParallelExecution instance;
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    private SingletonWithParallelExecution() {

    }

    private void initDriver(String browser){
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                tlDriver.set(new ChromeDriver());
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                tlDriver.set(new FirefoxDriver());
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                tlDriver.set(new EdgeDriver());
                break;

            default:
                throw new IllegalArgumentException("Unsuppoeted browser :"  +browser);
        }
    }

    public static SingletonWithParallelExecution getDriverInstance(String browser){
        if (instance==null){

            synchronized (SingletonWithParallelExecution.class){
                if (instance==null){
                    instance = new SingletonWithParallelExecution();
                }
            }
        }

        if (tlDriver.get()==null){
            instance.initDriver(browser);
        }

        return instance;

    }

    public WebDriver getDriver(){
        return tlDriver.get();
    }
    public static  void closeDriver(){
        if(tlDriver.get()!=null){
            tlDriver.get().quit();
            tlDriver.remove();
        }
    }
}
