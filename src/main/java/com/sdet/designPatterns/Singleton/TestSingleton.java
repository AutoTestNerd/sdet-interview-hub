package com.sdet.designPatterns.Singleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestSingleton {
    private static WebDriver driver;

    public static void main(String[] args) {
        driver = Singleton.getDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    }
}
