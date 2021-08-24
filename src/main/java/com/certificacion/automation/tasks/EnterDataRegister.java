package com.certificacion.automation.tasks;

import com.certificacion.automation.models.RegisterData;
import com.certificacion.automation.userinterfaces.RegisterInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterDataRegister implements Task {
    private RegisterData registerData;

    public EnterDataRegister(RegisterData registerData) {
        this.registerData = registerData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(registerData.getEmail()).into(RegisterInterfaces.ENTER_THE_EMAIL));
        actor.attemptsTo(Enter.theValue(registerData.getName()).into(RegisterInterfaces.ENTER_THE_NAME));
        actor.attemptsTo(Enter.theValue(registerData.getPhone()).into(RegisterInterfaces.ENTER_THE_PHONE));
        actor.attemptsTo(Click.on(RegisterInterfaces.SELECT_SAVE_BUTTON));

    }

    public static EnterDataRegister withData(RegisterData registerData) {
        return new EnterDataRegister(registerData);
    }
}
