package com.certificacion.automation.tasks;

import com.certificacion.automation.models.RegisterData;
import com.certificacion.automation.models.ReservationData;
import com.certificacion.automation.userinterfaces.ReservationInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EnterReservationData implements Task {

    private ReservationData reservationData;

    public EnterReservationData(ReservationData reservationData) {
        this.reservationData = reservationData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ReservationInterfaces.DATE_BUTTON));
        actor.attemptsTo(Click.on(ReservationInterfaces.NEXT_MONTH_BUTTON));
        actor.attemptsTo(Click.on(ReservationInterfaces.NEXT_MONTH_BUTTON));
        actor.attemptsTo(Click.on(ReservationInterfaces.DAY.of(reservationData.getDay())));
        actor.attemptsTo(Click.on(ReservationInterfaces.TIME_BUTTON.of(reservationData.getHour())));
        actor.attemptsTo(Click.on(ReservationInterfaces.KIND));
        actor.attemptsTo(Click.on(ReservationInterfaces.SCHEDULE_BUTTON));

    }
    public static EnterReservationData withData(ReservationData reservationData) {
        return new EnterReservationData(reservationData);
    }
}
