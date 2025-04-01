package com.sdet.designPatterns.BuilderPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    private  final By firstName = By.id("input-firstname");
    private  final By lastName = By.id("input-lastname");
    private  final By email = By.id("input-email");
    private  final By telephone = By.id("input-telephone");
    private  final By password = By.id("input-password");
    private  final By confirm = By.id("input-confirm");


    public void userRegister(Register resigter){

        driver.findElement(firstName).sendKeys(resigter.getFirstName());
        driver.findElement(lastName).sendKeys(resigter.getLastName());

        driver.findElement(email).sendKeys(resigter.getEmail());

        driver.findElement(telephone).sendKeys(resigter.getTel());
        driver.findElement(password).sendKeys(resigter.getPassword());
        driver.findElement(confirm).sendKeys(resigter.getConfirmPwd());

    }

}
