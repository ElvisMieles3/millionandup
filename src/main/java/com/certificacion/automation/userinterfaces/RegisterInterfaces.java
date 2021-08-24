package com.certificacion.automation.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterInterfaces {

    public static final Target ENTER_THE_EMAIL = Target
            .the("Enter the email")
            .located(By.id("email"));

    public static final Target ENTER_THE_NAME = Target
            .the("Enter the name")
            .located(By.id("name"));

    public static final Target ENTER_THE_PHONE = Target
            .the("Enter the phone")
            .located(By.id("phone"));

    public static final Target SELECT_SAVE_BUTTON = Target
            .the("Select save button")
            .locatedBy("(//*[@class='first_word_bold btn-black__text'])[1]");

    public static final Target RESPONSE_MESSAGE = Target
            .the("Response message user")
            .locatedBy("//*[@class='m-0 remark-form schedule-information']");

    public static final Target RESPONSE_MESSAGE_DATA_VALIDATION = Target
            .the("Response message user")
            .locatedBy("(//*[@class='validation-msg lead__validation-footer-text'])[1]");
}
