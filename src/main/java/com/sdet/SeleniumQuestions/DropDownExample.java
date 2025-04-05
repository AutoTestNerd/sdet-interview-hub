package com.sdet.SeleniumQuestions;

import com.sun.org.apache.xml.internal.utils.ThreadControllerWrapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://practice.expandtesting.com/dropdown");
        driver.manage().window().maximize();
        WebElement dropdown= driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 2");
        select.selectByIndex(1);
        Thread.sleep(3000);
        WebElement countryDropDown = driver.findElement(By.id("country"));
        Select select1 = new Select(countryDropDown);
        select1.selectByVisibleText("Albania");
        Thread.sleep(3000);

    }
}
