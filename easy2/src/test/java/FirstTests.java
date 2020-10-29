import com.codeborne.selenide.Configuration;
import com.easyqa.qa.pages.DashboardPage;
import com.easyqa.qa.pages.LoginPage;
import com.easyqa.qa.pages.ProjectPage;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class FirstTests {
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1600x1000";
    }

    @Test
    public void loginAsRegistratedUser() {

        LoginPage loginPage = open("https://app.geteasyqa.com/users/sign_in", LoginPage.class);
        LoginPage.enterLogin("andsev@gmail.com");
        LoginPage.enterPassword("HJOHohofhdo464878d");
        DashboardPage dashboardPage = LoginPage.clickLoginBtn();
        dashboardPage.checkUserAutorized();
    }
    @Test
    public void openProjects() {
        LoginPage loginPage = open("https://app.geteasyqa.com/users/sign_in", LoginPage.class);
        LoginPage.enterLogin("andsev@gmail.com");
        LoginPage.enterPassword("HJOHohofhdo464878d");
        DashboardPage dashboardPage = LoginPage.clickLoginBtn();
        dashboardPage.checkUserAutorized();
        ProjectPage projectPage = dashboardPage.openMyProjects();
        projectPage.checkProjectPage();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        close();
    }
}

