package selenide.hometask.one.hometask;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import registration.page.RegistrationPage;

public class SubmitTest {
    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenide\\chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.timeout=5000;
        Configuration.browserSize="1366x768";
    }

    @Test
    public void registrationFormFillingWithValidData(){
        RegistrationPage.noEmailErrorTriggering();
        RegistrationPage.errorMessage.shouldBe(Condition.textCaseSensitive("Invalid email address."));
        RegistrationPage.validEmailEntering();
        RegistrationPage.fillAllFieldsOnPersonalInfoForm();
        RegistrationPage.fillAllFieldsOnAddressForm();
        RegistrationPage.formSubmit();
        RegistrationPage.logout();
    }
}