package com.certificacion.automation.questions;

import com.certificacion.automation.userinterfaces.RegisterInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegisterDataValidate implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((RegisterInterfaces.RESPONSE_MESSAGE_DATA_VALIDATION),
                WebElementStateMatchers.isVisible()));

        return Text.of(RegisterInterfaces.RESPONSE_MESSAGE_DATA_VALIDATION).viewedBy(actor).asString();
    }

    public static RegisterDataValidate message() {
        return new RegisterDataValidate();

    }
}
