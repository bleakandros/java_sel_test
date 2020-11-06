package com.easyqa.qa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class ProjectPage {
    @FindBy(xpath = "//a[@href='/projects']")
    public SelenideElement projectsHeader;

    @FindBy(xpath = "//a[@class='project-name']")
    public SelenideElement projectName;

    @Step
    public void checkProjectPage() {
        projectsHeader.shouldBe(Condition.visible);

    }

    @Step
    public ProjectDashboardPage openProject() {
        projectName.click();
        return page (ProjectDashboardPage.class);
    }
}
