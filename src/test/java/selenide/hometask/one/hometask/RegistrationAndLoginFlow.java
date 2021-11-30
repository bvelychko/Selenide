package selenide.hometask.one.hometask;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationAndLoginFlow {
    @Test
    public void registration() {
        open("http://automationpractice.com/index.php");
        $(By.cssSelector("a[href*=my-account]")).click();
        sleep(3000);
        $(By.name("SubmitCreate")).click();
        sleep(3000);
        $(By.id("create_account_error")).shouldBe(Condition.textCaseSensitive("Invalid email address."));
        $(By.name("email_create")).setValue("test1234567@gmail.com");
        $(By.name("SubmitCreate")).scrollIntoView("true");
        $(By.name("SubmitCreate")).click();
        $(By.id("id_gender1")).click();
        $(By.id("customer_firstname")).setValue("First");
        $(By.name("customer_lastname")).setValue("Last");
        $(By.id("passwd")).setValue("12345");
        $(By.name("days")).selectOptionByValue("5");
        $(By.name("months")).selectOptionByValue("10");
        sleep(3000);
        $(By.name("years")).selectOptionByValue("1990");
        sleep(3000);
        $(By.name("optin")).click();
        $(By.name("firstname")).setValue("First");
        $(By.name("lastname")).setValue("Last");
        $(By.id("company")).setValue("TestCompany");
        $(By.id("address1")).setValue("Street address");
        $(By.id("address2")).setValue("Suite");
        $(By.id("city")).setValue("San Andreas");
        $(By.name("id_state")).selectOptionByValue("1");
        $(By.id("postcode")).setValue("12345");
        $(By.id("city")).setValue("Simple text");
        sleep(3000);
        $(By.id("phone")).setValue("12345678");
        $(By.id("phone_mobile")).setValue("+312345678");
        $(By.id("alias")).clear();
        $(By.id("alias")).setValue("text");
        $(By.name("submitAccount")).click();
        sleep(3000);
        $(By.className("info-account")).shouldBe(Condition.text("Welcome to your account. Here you can manage all of your personal information and orders."));


        }

public void login() {
    open("http://automationpractice.com/index.php");
    $(By.className("login")).click();
    $(By.id("email")).setValue("test1234567@gmail.com");
    $(By.id("passwd")).click();
    $(By.id("email")).shouldHave(Condition.cssValue("color","rgba(53, 179, 63, 1)"));
    sleep(3000);
    $(By.id("passwd")).setValue("12345");
    $(By.name("SubmitLogin")).click();
    $(By.className("info-account")).shouldBe(Condition.text("Welcome to your account. Here you can manage all of your personal information and orders."));
    sleep(3000);




}

    }
