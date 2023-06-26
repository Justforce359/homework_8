package com.justforce359.tests;


import com.justforce359.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.justforce359.data.TestDataGenerator.*;


public class HwPageObjectsTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstname(firstName)
                .setLastname(lastName)
                .setUserEmail(userEmail)
                .setGender(userGender)
                .userNumber(phoneNumber)
                .setBirthDate(rDay, rMonth, rYear)
                .setSubjectsInput(subjects)
                .hobbiesInput(hobbies)
                .uploadPic(randomPic)
                .currentAdd(currentAdd)
                .stateAndCityInput(randomState, randomCity)
                .submitClick();

        registrationPage.shouldHave("Thanks for submitting the form")
                .resultFormCheck("Student Name", firstName
                        + " " + lastName)
                .resultFormCheck("Student Email", userEmail)
                .resultFormCheck("Gender", userGender)
                .resultFormCheck("Mobile", phoneNumber)
                .resultFormCheck("Date of Birth", rDay + " " + rMonth + "," + rYear)
                .resultFormCheck("Subjects", subjects)
                .resultFormCheck("Hobbies", hobbies)
                .resultFormCheck("Picture", randomPic)
                .resultFormCheck("Address", currentAdd)
                .resultFormCheck("State and City", randomState + " " + randomCity)
                .closeModalWindow();
    }
}
