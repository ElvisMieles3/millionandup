package com.certificacion.automation.stepdefinitions;

import com.certificacion.automation.models.ReservationData;
import com.certificacion.automation.tasks.EnterReservationData;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class Reservation {

    @When("^The User in the reservation form enters the data$")
    public void theUserInTheReservationFormEntersTheData(List<ReservationData> reservationData) {

        OnStage.theActorInTheSpotlight().attemptsTo(EnterReservationData.withData(reservationData.get(0)));

    }

    @When("^the user must see the reservation confirmation (.*)$")
    public void theUserMustSeeTheReservationConfirmation(String message) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.
                seeThat(com.certificacion.automation.questions.Reservation.message(),
                        org.hamcrest.Matchers.equalTo(message)));

    }

}
