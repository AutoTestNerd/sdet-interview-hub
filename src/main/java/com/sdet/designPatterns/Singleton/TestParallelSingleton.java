package com.sdet.designPatterns.Singleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestParallelSingleton {

    private static WebDriver driver;

    public static void main(String[] args) {
     driver =   SingletonWithParallelExecution.getDriverInstance("firefox").getDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        SingletonWithParallelExecution.closeDriver();
    }
}
