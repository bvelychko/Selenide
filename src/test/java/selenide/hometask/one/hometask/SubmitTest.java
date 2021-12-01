package selenide.hometask.one.hometask;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class SubmitTest {
    @Test
    public void testSubmit(){
        open("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        RegistrationFlowPageObject.login();
        RegistrationFlowPageObject.errorMessage.shouldBe(Condition.textCaseSensitive("Invalid email address."));

    }
}