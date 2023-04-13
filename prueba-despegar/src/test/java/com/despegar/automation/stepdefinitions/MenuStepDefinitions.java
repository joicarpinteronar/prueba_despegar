package com.despegar.automation.stepdefinitions;

import com.despegar.automation.tasks.navigations.Navigate;
import com.despegar.automation.tasks.opcionesmenu.SelectMenuOptions;
import com.despegar.automation.tasks.opcionesmenu.SelectMenuOptionsOneWay;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Y;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class MenuStepDefinitions {

    @Dado("^que un (.*) ingresa al portal de Despegar$")
    public void goToThePortal(String actor) {
        theActorCalled(actor).wasAbleTo(Navigate.openUrl());
    }

    @Y("^el viajero selecciona el menu de Vuelos y selecciona la opcion de Ida y Vuelta$")
    public void goToTheMenu() {
        theActorInTheSpotlight().attemptsTo(SelectMenuOptions.goMenu());
    }
    @Y("^el viajero selecciona el menu de Flights y selecciona la opcion One-way$")
    public void goToTheMenuOneWay() {
        theActorInTheSpotlight().attemptsTo(SelectMenuOptionsOneWay.goMenuOneWay());
    }
}
