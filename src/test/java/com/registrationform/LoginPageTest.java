package com.registrationform;

import com.registrationform.pages.HomePage;
import com.registrationform.pages.LoginPage;
import com.registrationform.pages.MainPage;
import com.registrationform.selenium.SeleniumBase;
import com.registrationform.utils.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.fest.assertions.Assertions.assertThat;

public class LoginPageTest extends SeleniumBase {

    private User user;

    @BeforeMethod
    public void executeBeforeTest() {
        user = new User();
    }

    @Test
    public void shouldRegisterNewUserAndLogIn() {
        // given
        LoginPage loginPage = new MainPage()
                .open()
                .navigateToRegistrationPage()
                .registerNewUser(user);

        // when
        HomePage homePage = loginPage
                .setUserName(user.getUsername())
                .setPassword(user.getPassword())
                .clickLoginButton();

        // then
        assertThat(homePage.getWelcomeMessage()).isEqualTo(String.format("Hello %s %s, Good to see you!", user.getFirstName(), user.getLastName()));
    }

}
