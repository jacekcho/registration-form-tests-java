package com.registrationform.selenium;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SeleniumBase {

    private ChromeDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.getChromeDriver();
        setUpSelenide();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

    private void setUpSelenide() {
        WebDriverRunner.setWebDriver(driver);
    }
}
