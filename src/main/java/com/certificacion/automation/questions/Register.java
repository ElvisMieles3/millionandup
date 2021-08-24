package com.certificacion.automation.questions;

import com.certificacion.automation.userinterfaces.RegisterInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Register implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((RegisterInterfaces.RESPONSE_MESSAGE), WebElementStateMatchers.isVisible()));

        return Text.of(RegisterInterfaces.RESPONSE_MESSAGE).viewedBy(actor).asString();
    }

    public static Register message() {
        return new Register();

    }
}
