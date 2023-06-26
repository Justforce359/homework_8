package com.justforce359.tests;


import com.justforce359.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.justforce359.tests.TestData.*;


public class HwPageObjectsTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstname(firstName)
                .setLastname(lastName)
                .setUserEmail(userEmail)
                .setGender("Male")
                .userNumber("1234567890")
                .setBirthDate("10", "May", "2000")
                .setSubjectsInput("Maths")
                .hobbiesInput("Reading")
                .uploadPic("pic.png")
                .currentAdd("fbv;oksdfolibvjsdifb")
                .stateAndCityInput("Uttar Pradesh", "Agra")
                .submitClick();

        registrationPage.shouldHave("Thanks for submitting the form")
                .resultFormCheck("Student Name", firstName
                        + " " + lastName)
                .resultFormCheck("Student Email", userEmail)
                .resultFormCheck("Gender", "Male")
                .resultFormCheck("Mobile", "1234567890")
                .resultFormCheck("Date of Birth", "10 May,2000")
                .resultFormCheck("Subjects", "Maths")
                .resultFormCheck("Hobbies", "Reading")
                .resultFormCheck("Picture", "pic.png")
                .resultFormCheck("Address", "fbv;oksdfolibvjsdifb")
                .resultFormCheck("State and City", "Uttar Pradesh Agra")
                .closeModalWindow();
    }
}
