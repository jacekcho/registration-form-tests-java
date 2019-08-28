package com.registrationform;

import com.codeborne.selenide.Selenide;
import org.fest.assertions.Assertions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class FirstTest {

    @Test
    public void shouldPrintHelloWorld() {
        // then
        System.out.println("Hello World!");
    }

    @Test
    public void shouldOpenWpHomePage() {
        // when
        open("http://wp.pl");

        // then
        Assertions.assertThat(Selenide.title()).isEqualTo("Wirtualna Polska - Wszystko co ważne - www.wp.pl");
    }
}
