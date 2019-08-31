package com.registrationform.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class RegistrationPage {

    @FindBy(name = "firstName")
    private SelenideElement firstName;

    @FindBy(name = "lastName")
    private SelenideElement lastName;

    @FindBy(name = "username")
    private SelenideElement userName;

    @FindBy(name = "password")
    private SelenideElement password;

    RegistrationPage() {
        page(this);
    }

    public RegistrationPage setFirstName(String firstName) {
        this.firstName.setValue(firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        this.lastName.setValue(lastName);
        return this;
    }

    public RegistrationPage setUserName(String userName) {
        this.userName.setValue(userName);
        return this;
    }

    public RegistrationPage setPassword(String password) {
        this.password.setValue(password);
        return this;
    }

    public void clickRegisterButton() {
        //TODO
    }

}
