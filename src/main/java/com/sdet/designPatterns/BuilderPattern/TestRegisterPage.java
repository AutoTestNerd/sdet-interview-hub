package com.sdet.designPatterns.BuilderPattern;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRegisterPage {
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
      Register register = new Register.RegisterBuilder()
                 .setEmail("abc@gmail.com")
               .setFirstName("Autoomation")
               .setLastName("Sdet")
               .setPassword("abc1234")
               .setConfirmPwd("manish@1234")
               .setTel("9999999999")
               .build();// Register class object
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.userRegister(register);
    }



}
