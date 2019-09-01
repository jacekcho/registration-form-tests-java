package com.registrationform;

import com.registrationform.pages.LoginPage;
import com.registrationform.pages.MainPage;
import com.registrationform.pages.RegistrationPage;
import com.registrationform.selenium.SeleniumBase;
import org.testng.annotations.Test;

import static com.registrationform.utils.Generators.*;
import static org.fest.assertions.Assertions.assertThat;

public class RegistrationPageTest extends SeleniumBase {

    @Test
    public void shouldRegisterNewUser() {
        // given
        RegistrationPage registrationPage = new MainPage()
                .open()
                .navigateToRegistrationPage();

        // when
        LoginPage loginPage = registrationPage
                .setFirstName(randomFirstName())
                .setLastName(randomLastName())
                .setUserName(randomUserName())
                .setPassword("QW12qw12")
                .clickRegisterButton();

        // then
        assertThat(loginPage.getConfirmation()).isEqualTo("Registration successful");
    }
}
