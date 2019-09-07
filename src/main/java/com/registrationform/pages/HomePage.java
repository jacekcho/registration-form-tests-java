package com.registrationform.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class HomePage {

    @FindBy(css = "[data-test='message']")
    private SelenideElement welcomeMessage;

    HomePage() {
        page(this);
    }

    public String getWelcomeMessage() {
        return welcomeMessage.text();
    }
}
