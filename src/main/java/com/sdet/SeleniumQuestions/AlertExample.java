package com.sdet.SeleniumQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {
    private static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();


        // Information ALert
//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        Alert alert = driver.switchTo().alert();
//        String alertMsg = alert.getText();
//        System.out.println(alertMsg);
//        Thread.sleep(3000);
//        alert.accept();
//        driver.close();
//
//
//        // Confirmation Alert
//
//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//
//        Alert alert1 = driver.switchTo().alert();
//        String alertTest = alert1.getText();
//        alert1.accept();
//        driver.close();



        //Proompt Alert
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("manish");
        String alertText1= alert2.getText();
        System.out.println(alertText1);
        Thread.sleep(3000);
        alert2.accept();
        driver.close();



    }
}
