package selenide.hometask.one.hometask;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import pages.RegistrationFlowPageObject;

public class SubmitTest {
    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenide\\chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.timeout=5000;
    }

    @Test
    public void testSubmit(){
        RegistrationFlowPageObject.login();
        RegistrationFlowPageObject.errorMessage.shouldBe(Condition.textCaseSensitive("Invalid email address."));
    }
}