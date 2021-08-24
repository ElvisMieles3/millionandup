package com.certificacion.automation.stepdefinitions;

import com.certificacion.automation.models.RegisterData;
import com.certificacion.automation.tasks.EnterDataRegister;
import com.certificacion.automation.tasks.OpenBrowser;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class Register {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void SetUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        OnStage.theActorCalled("Elvis");
    }

    @Given("^that Elvis is in the portal$")
    public void thatElvisIsInThePortal() {

        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^he enters the credentials$")
    public void heEntersTheCredentials(List<RegisterData> registerData) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterDataRegister.withData(registerData.get(0)));
    }

    @When("^user should see message (.*)$")
    public void userShouldSeeMessage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.
                seeThat(com.certificacion.automation.questions.Register.message(),
                        org.hamcrest.Matchers.equalTo(message)));
    }

    @When("^The user should see the validation message (.*)$")
    public void TheUserShouldSeeTheValidationMessage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.
                seeThat(com.certificacion.automation.questions.RegisterDataValidate.message(),
                        org.hamcrest.Matchers.equalTo(message)));
    }

    @After
    public void closeScenari() {
        OnStage.drawTheCurtain();
    }
}
