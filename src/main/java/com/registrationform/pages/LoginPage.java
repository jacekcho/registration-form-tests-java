package com.registrationform.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    @FindBy(id = "loginButton")
    private SelenideElement loginButton;

    @FindBy(id = "registrationButton")
    private SelenideElement registrationButton;

    @FindBy(className = "alert-success")
    private SelenideElement confirmation;

    @FindBy(css = "input[data-test='password']")
    private SelenideElement password;

    LoginPage() {
        page(this);
    }

    public String getRegisterConfirmation() {
        return confirmation.text();
    }

    public LoginPage setUserName(String userName) {
        // TODO
        return this;
    }

    public LoginPage setPassword(String password) {
        this.password.setValue(password);
        return this;
    }

    public HomePage clickLoginButton() {
        loginButton.click();
        return new HomePage();
    }
}
