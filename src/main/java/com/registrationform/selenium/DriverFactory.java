package com.registrationform.selenium;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static ChromeDriver getChromeDriver() {
        ChromeDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
