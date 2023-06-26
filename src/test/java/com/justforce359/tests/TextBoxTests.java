package com.justforce359.tests;

import com.justforce359.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

import static com.justforce359.data.TestDataGenerator.*;


public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void TextBoxTests() {
        textBoxPage.openPage()
                .setUserName(firstName + " " + lastName)
                .setEmail(userEmail)
                .setCurrentAddress(currentAdd)
                .setPermanentAddress(permAdd)
                .setClick();
                textBoxPage.checkResult(firstName + " " + lastName,
                        userEmail,
                        currentAdd,
                        permAdd);

    }

}
