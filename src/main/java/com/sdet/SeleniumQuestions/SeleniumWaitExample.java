package com.sdet.SeleniumQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWaitExample {

    private static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://google.com");

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        driver.get("amazon.in");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));

        // Fluent Wait

        Wait<WebDriver> fluentwait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        WebElement element = fluentwait.until(driver1 -> driver.findElement(By.id("login")));

    }
}
