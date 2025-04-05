package com.sdet.SeleniumQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/droppable/");

       // Switch to frame
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

         WebElement source = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(source,dest).perform();
        Thread.sleep(3000);


    }
}
