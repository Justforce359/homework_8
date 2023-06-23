package com.justforce359.tests;

import com.justforce359.pages.TextBoxPage;
import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void TextBoxTests() {
        textBoxPage.openPage()
                .setUserName("Mikhail Ustinov")
                .setEmail("somename@mail.com")
                .setCurrentAddress("Some Current: Address.666")
                .setPermanentAddress("Some Permanent Address 999")
                .setClick();
                textBoxPage.checkResult("Mikhail Ustinov",
                        "somename@mail.com",
                        "Some Current: Address.666",
                        "Some Permanent Address 999");

    }

}
