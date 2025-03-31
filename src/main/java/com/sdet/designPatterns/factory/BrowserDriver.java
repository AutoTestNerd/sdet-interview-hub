package com.sdet.designPatterns.factory;

import org.openqa.selenium.WebDriver;

public interface BrowserDriver {
   WebDriver createDriver();
}
