package com.certificacion.automation.questions;

import com.certificacion.automation.userinterfaces.ReservationInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Reservation implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((ReservationInterfaces.RESPONSE_MESSAGE_DATA_RESERVATION),
                WebElementStateMatchers.isVisible()));

        return Text.of(ReservationInterfaces.RESPONSE_MESSAGE_DATA_RESERVATION).viewedBy(actor).asString();
    }

    public static Reservation message() {
        return new Reservation();

    }
}
