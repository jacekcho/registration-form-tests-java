package com.registrationform.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    @FindBy(id = "loginButton")
    private SelenideElement loginButton;

    @FindBy(id = "registrationButton")
    private SelenideElement registrationButton;

    @FindBy(css = "[class='alert alert-success']")
    private SelenideElement confirmation;

    LoginPage() {
        page(this);
    }

    public String getRegisterConfirmation() {
        return confirmation.text();
    }

}
