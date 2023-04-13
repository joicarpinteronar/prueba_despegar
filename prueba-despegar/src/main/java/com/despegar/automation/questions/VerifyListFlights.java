package com.despegar.automation.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.despegar.automation.userinterfaces.searchflights.SearchFlightsPage.TOTAL_FINAL_PRICE;


public class VerifyListFlights implements Question<Boolean> {

    public static VerifyListFlights selected() {
        return new VerifyListFlights();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (TOTAL_FINAL_PRICE.resolveFor(actor).getText().equals(Serenity.sessionVariableCalled("flightPrice")))
            return true;
        return false;
    }
}
