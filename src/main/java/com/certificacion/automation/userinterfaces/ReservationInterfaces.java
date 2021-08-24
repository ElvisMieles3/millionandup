package com.certificacion.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservationInterfaces {

    public static final Target DATE_BUTTON = Target
            .the("Select the date")
            .locatedBy("(//*[@class='input-icon mx-1 scheduleDate scheduleDate__arrow'])[1]");


    public static final Target NEXT_MONTH_BUTTON = Target
            .the("Next mont button")
            .locatedBy("//span[@class='fc-icon fc-icon-chevron-right']");

    public static final Target TIME_BUTTON = Target
            .the("Select the time")
            .locatedBy("(//*[contains(text(),'{0}')])[2]");

    public static final Target DAY = Target
            .the("Select the day")
            .locatedBy("(//*[@class='fc-daygrid-day-number'])[{0}]");

    public static final Target KIND = Target.
            the("Select the KIND ")
            .locatedBy("(//*[@class='span-3 bd-highlight icon icon-play-video'])[1]");

    public static final Target SCHEDULE_BUTTON = Target.
            the("Select the button schedule ")
            .locatedBy("//*[@class='span-3 icon icon-arrow-forward btn-black__icon']");

    public static final Target RESPONSE_MESSAGE_DATA_RESERVATION = Target.
            the("Response message data reservation")
            .locatedBy("(//*[@class='d-flex schedule-response-text'])[1]");

}
