package com.sdet.SeleniumQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;

public class ScrollScript {
    private static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://amazon.in");
//        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("camera");
//        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//
//        // // Scroll down 500px
//        executor.executeScript("window.scrollBy(0,500)");

        //  // Scroll to bottom

//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");


        //Scroll to specific elementt
//        WebElement element= driver.findElement(By.xpath("//span[contains(text(),'Customer Review')]"));
//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].scrollIntoView(true);",element);
//        Thread.sleep(2000);


        //Scroll horizonatll
        WebElement scrollableCarousel = driver.findElement(By.xpath("//div[contains(@class,'a-carousel')]"));

        JavascriptExecutor js1 = (JavascriptExecutor)driver;
        js1.executeScript("arguments[0].shiftLeft += 300",scrollableCarousel);






    }
}
