package com.sdet.SeleniumQuestions.SeleniumPOMFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "userName")
    WebElement username;

    @FindBy(id = "password")
    WebElement pwd;

    @FindBy(id = "login")
    WebElement loginButton;
    public void login(String user, String pass) {
        username.sendKeys(user);
        pwd.sendKeys(pass);
        loginButton.click();
    }
}
