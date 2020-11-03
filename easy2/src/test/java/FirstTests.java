import com.codeborne.selenide.Configuration;
import com.easyqa.qa.pages.*;
import com.easyqa.qa.pages.util.UserData;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import com.easyqa.qa.pages.util.CardData;

public class FirstTests {
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1600x1000";
    }
/*
    @Test
    public void loginAsRegistratedUser() {

        LoginPage loginPage = open("https://app.geteasyqa.com/users/sign_in", LoginPage.class);
        loginPage.enterLogin("andsev@gmail.com");
        loginPage.enterPassword("HJOHohofhdo464878d");
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.checkUserAutorized();
    }

    @Test
    public void openProjects() {
        LoginPage loginPage = open("https://app.geteasyqa.com/users/sign_in", LoginPage.class);
        loginPage.enterLogin("andsev@gmail.com");
        loginPage.enterPassword("HJOHohofhdo464878d");
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.checkUserAutorized();
        ProjectPage projectPage = dashboardPage.openMyProjects();
        projectPage.checkProjectPage();
    }
*/
    @Test
    public void CreateCard() {
        CardData issue = new CardData(0,"test1", "test description");
        UserData newUser = new UserData("andsev@gmail.com", "HJOHohofhdo464878d");
        LoginPage loginPage = open("https://app.geteasyqa.com/users/sign_in", LoginPage.class);
        loginPage.enterLogin(newUser.getUserMail());
        loginPage.enterPassword(newUser.getUserPassword());
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.checkUserAutorized();
        ProjectPage projectPage = dashboardPage.openMyProjects();
        projectPage.checkProjectPage();
        ProjectDashboardPage projectDashboardPage = projectPage.openProject();
        projectDashboardPage.checkProjectDashboardPage();
        IssuesPage issuesPage = projectDashboardPage.openIssues();
        issuesPage.checkIssuesPage();
        issuesPage.clickAddNewIssue();
        issuesPage.addNewIssue(issue.getCardPriority(), issue.getCardName(), issue.getCardDescription());
        issuesPage.checkIssueAdded(issue.getCardName());
    }

    @AfterMethod
    public void tearDown() throws Exception {
        close();
    }
}

