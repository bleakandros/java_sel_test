import com.codeborne.selenide.Configuration;
import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class FirstTests {

    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        Configuration.browser = "chrome";
    }
    @Test
    public void testUntitledTestCase() {
        open("https://app.geteasyqa.com/users/sign_in");
        $(By.id("user_email")).click();
        $(By.id("user_email")).clear();
        $(By.id("user_email")).sendKeys("andsev@gmail.com");
        $(By.id("user_email")).click();
        $(By.id("user_password")).clear();
        $(By.id("user_password")).sendKeys("HJOHohofhdo464878d");
        $(By.name("commit")).click();
    }
    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        close();
    }
}

