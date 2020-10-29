package com.easyqa.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

    @FindBy(xpath = "//a[@href='/user/edit']")
    public SelenideElement profileLink;

    @FindBy(xpath = "//a[@href='/projects']")
    public SelenideElement myProjectsLink;

    public void checkUserAutorized() {
        profileLink.shouldBe(Condition.visible);
    }

    public ProjectPage openMyProjects() {
        myProjectsLink.click();
        return Selenide.page(ProjectPage.class);
    }
}
