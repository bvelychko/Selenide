package selenide.hometask.one.hometask;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFlowPageObject {
    public static SelenideElement signInBtn = $("a[href*=my-account]"),
                                  createdBtn = $("#SubmitCreate"),
                                  errorMessage = $("#create_account_error");

    public static void login() {
        signInBtn.click();
        sleep(3000);
        createdBtn.click();
    }
}