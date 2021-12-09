package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationFlowPageObject {

    public static SelenideElement signInBtn = Selenide.$("a[href*=my-account]"),
                                  createdBtn = Selenide.$("#SubmitCreate"),
                                  errorMessage = Selenide.$("#create_account_error");

    public static void login() {
        open("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        signInBtn.click();
        Selenide.sleep(3000);
        createdBtn.click();
    }
}