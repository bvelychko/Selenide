package registration.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.UUID;

public class RegistrationPage {
    static String uuid = UUID.randomUUID().toString();
    static String email = uuid + "@gmail.com";

    public static SelenideElement   signInButton = Selenide.$("a[href*=my-account]"),
                                    createdButton = Selenide.$("#SubmitCreate"),
                                    errorMessage = Selenide.$("#create_account_error"),
                                    emailField = Selenide.$("#email_create"),
                                    genderRadioButton = Selenide.$("#id_gender1"),
                                    firstNameField = Selenide.$("#customer_firstname"),
                                    secondNameField = Selenide.$("#customer_lastname"),
                                    passwordField = Selenide.$("#passwd"),
                                    dateButton = Selenide.$("#days"),
                                    monthsButton = Selenide.$("#months"),
                                    yearsButton = Selenide.$("#years"),
                                    offersButton = Selenide.$("#optin"),
                                    addressFirstNameField = Selenide.$("#firstname"),
                                    addressLastNameField = Selenide.$("#lastname"),
                                    companyField = Selenide.$("#company"),
                                    streetField = Selenide.$("#address1"),
                                    suiteField = Selenide.$("#address2"),
                                    cityField = Selenide.$("#city"),
                                    stateField = Selenide.$("#id_state"),
                                    postcodeField = Selenide.$("#postcode"),
                                    phoneField = Selenide.$("#phone"),
                                    mobilePhoneField = Selenide.$("#phone_mobile"),
                                    aliasField = Selenide.$("#alias"),
                                    submitButton = Selenide.$("#submitAccount"),
                                    logoutButton = Selenide.$("a[href*=mylogout]");


    public static void noEmailErrorTriggering() {
        Selenide.open("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        signInButton.click();
        Selenide.sleep(3000);
        createdButton.click();
    }

    public static void validEmailEntering() {
        emailField.setValue(email);
        createdButton.click();
    }

    public static void fillAllFieldsOnPersonalInfoForm() {
        genderRadioButton.click();
        firstNameField.setValue("First");
        secondNameField.setValue("Last");
        passwordField.setValue("12345");
        dateButton.selectOptionByValue("5");
        monthsButton.selectOptionByValue("10");
        yearsButton.selectOptionByValue("1990");
        offersButton.click();
    }

    public static void fillAllFieldsOnAddressForm() {
        addressFirstNameField.setValue("First");
        addressLastNameField.setValue("Last");
        companyField.setValue("TestCompany");
        streetField.setValue("Street address");
        suiteField.setValue("Suite");
        cityField.setValue("San Andreas");
        stateField.selectOptionByValue("1");
        postcodeField.setValue("12345");
        phoneField.setValue("12345678");
        mobilePhoneField.setValue("+312345678");
        aliasField.clear();
        aliasField.setValue("text");
    }

    public static void formSubmit() {
        submitButton.click();
        Selenide.sleep(3000);
    }

    public static void logout() {
        logoutButton.click();
        Selenide.sleep(3000);
    }
}