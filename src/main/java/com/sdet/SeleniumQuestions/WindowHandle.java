package com.sdet.SeleniumQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class WindowHandle {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parentWindow= driver.getWindowHandle();
        driver.findElement(By.id("newWindowBtn")).click();
       Set<String> windows = driver.getWindowHandles();
       for (String window : windows){

           if(!window.equals(parentWindow)){
               driver.switchTo().window(window);
               driver.findElement(By.id("firstName")).sendKeys("Manish");
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       }
       driver.switchTo().window(parentWindow);

    }
}
