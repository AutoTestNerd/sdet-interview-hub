package com.sdet.SeleniumQuestions.SeleniumPOMFramework;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;

import java.io.FileNotFoundException;

//@Listeners(TestListener.class)
public class LoginTest {
    private static WebDriver driver;

//        @Test
         public void testLogin() throws FileNotFoundException {
            ConfigReader.loadConfig();
            driver = DriverFactory.initDriver();
            driver.get(ConfigReader.getConfig("url"));
            loginPage login = new loginPage(driver);
            login.login("testuser","testpass");

        }


}
