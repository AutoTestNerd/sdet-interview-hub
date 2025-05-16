package com.sdet.SeleniumQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class HowToFindBrokenLink {

    private static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://amazon.in");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + allLinks.size());
        for (WebElement link:allLinks){
            String url = link.getAttribute("href");
            if(url == null  || url.isEmpty()){
                System.out.println("Link is empty or not configured: " + link.getText());
                continue;
            }

            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(10000);
                conn.setReadTimeout(10000);
                conn.setInstanceFollowRedirects(true);
                conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
                conn.connect();
                int responcode = conn.getResponseCode();
                if(responcode >=400){
                    System.out.println("❌ Broken Link: " + url + " — Response Code: " + responcode);
                } else {
                    System.out.println("✅ Valid Link: " + url + " — Response Code: " + responcode);
                }

            } catch (Exception e) {
            System.out.println("⚠️ Exception for URL: " + url + " — " + e.getMessage());
            }

        }


    }
}
