package com.registrationform.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.netflix.config.DynamicProperty;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    @FindBy(id = "registerButton")
    private SelenideElement registerButton;

    private String mainPageUrl = DynamicProperty.getInstance("url").getString();

    public MainPage() {
        page(this);
    }

    public MainPage open() {
        Selenide.open(mainPageUrl);
        return this;
    }

    public RegistrationPage navigateToRegistrationPage() {
        registerButton.click();
        return new RegistrationPage();
    }

}
