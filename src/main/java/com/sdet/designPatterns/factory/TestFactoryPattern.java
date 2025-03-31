package com.sdet.designPatterns.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestFactoryPattern {
    private static WebDriver driver;

    public static void main(String[] args) {

        driver=DriverFactory.getDriver("chrome").createDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

    }
}
