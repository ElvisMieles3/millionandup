package com.certificacion.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/reservation.feature",
        glue = "com.certificacion.automation.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class Reservation {
}
