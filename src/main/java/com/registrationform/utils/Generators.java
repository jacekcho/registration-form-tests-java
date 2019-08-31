package com.registrationform.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Generators {

    public static Faker faker = new Faker(new Locale("en"));

    public static String randomFirstName() {
        return faker.name().firstName();
    }

    public static String randomLastName() {
        return faker.name().lastName();
    }

    public static String randomUserName() {
        return faker.pokemon().name();
    }

}