package com.sdet.designPatterns.Singleton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Singleton {

    // Step to create singleton pattern:


     // 1. private instance of the class
    //Static - The variable belongs to the class itself, not any instance of it.
     private  static WebDriver driver;

    // 2. Create private constructor to  prevent/Avoid  instantiation.
    private Singleton() {
    }

    /*
       3. Lazy initialization- The getDriver() method initializes the WebDriver instance
          only if it doesn’t already exist.
       4. create a public method to provide global point of access to that instance and object.-
          The getDriver() method provides a global access point to the WebDriver instance.
       Note: - The synchronized keyword is used to prevent multiple threads from creating multiple
               instances of the WebDriver in a multithreaded environment.
    */
    public static WebDriver getDriver(){
        if (driver==null){ //The first if (driver == null) prevents unnecessary synchronization after the instance is created.
            synchronized (Singleton.class)
            {
                if(driver==null){ //The second if (driver == null) ensures that only one thread initializes the driver.


                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
            }
        }

        return driver;
    }
    /* 5. Resource Cleanup.
           The closeDriver() method quits the WebDriver session and resets
           the driver variable to null, making it ready for reuse in future test executions
     */
    public static  void closeDriver(){
        if(driver!=null){
          driver.quit();
          driver=null;
        }
    }

}
