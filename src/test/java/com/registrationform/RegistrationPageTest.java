package com.registrationform;

import com.registrationform.pages.MainPage;
import com.registrationform.pages.RegistrationPage;
import com.registrationform.selenium.SeleniumBase;
import com.registrationform.utils.Generators;
import org.testng.annotations.Test;

public class RegistrationPageTest extends SeleniumBase {

    @Test
    public void shouldOpenWpHomePage() {
        // given
        RegistrationPage registrationPage = new MainPage()
                .open()
                .navigateToRegistrationPage();

        // when
        registrationPage
                .setFirstName(Generators.randomFirstName())
                .setLastName(Generators.randomLastName())
                .setUserName(Generators.randomUserName())
                .setPassword("QW12qw12")
                .clickRegisterButton();

        // then
    }
}
