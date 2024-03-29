package com.registrationform;

import com.registrationform.pages.LoginPage;
import com.registrationform.pages.MainPage;
import com.registrationform.pages.RegistrationPage;
import com.registrationform.selenium.SeleniumBase;
import com.registrationform.utils.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

public class RegistrationPageTest extends SeleniumBase {

    private User user;

    @BeforeMethod
    public void executeBeforeTest() {
        user = new User();
    }

    @Test
    public void shouldRegisterNewUserAndLogIn() {
        // given
        RegistrationPage registrationPage = new MainPage()
                .open()
                .navigateToRegistrationPage();

        // when
        LoginPage loginPage = registrationPage
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setUserName(user.getUsername())
                .setPassword(user.getPassword())
                .clickRegisterButton();

        // then
        assertThat(loginPage.getRegisterConfirmation()).isEqualTo("Registration successful");
    }
}
