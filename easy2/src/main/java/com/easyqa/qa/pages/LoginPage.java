package com.easyqa.qa.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    @FindBy(id = "user_email")
    public static SelenideElement login;

    @FindBy(id = "user_password")
    public static SelenideElement password;

    @FindBy(name = "commit")
    public static SelenideElement loginBtn;

    public static void enterLogin(String userLogin) {
        login.click();
        login.clear();
        login.sendKeys(userLogin);
    }

    public static void enterPassword(String userPassword) {
        password.click();
        password.clear();
        password.sendKeys(userPassword);
    }

    public static DashboardPage clickLoginBtn() {
        loginBtn.click();
        return page(DashboardPage.class);
    }
}
