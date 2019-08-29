package com.registrationform;

import com.registrationform.pages.MainPage;
import com.registrationform.selenium.SeleniumBase;
import org.testng.annotations.Test;

public class RegistrationPageTest extends SeleniumBase {

    @Test
    public void shouldOpenWpHomePage() {
        // given
        new MainPage().open().navigateToRegistrationPage();

        // then
    }
}
