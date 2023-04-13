package com.despegar.automation.tasks.searchflights;

import com.despegar.automation.interactions.waits.WaitElement;
import com.despegar.automation.interactions.waits.WaitFor;
import com.despegar.automation.models.searchflights.SearchFlightsModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import static com.despegar.automation.userinterfaces.searchflights.SearchHotelPage.*;


public class SearchAccomoding implements Task {

    SearchFlightsModel flights;

    public SearchAccomoding(SearchFlightsModel flights) {
        this.flights = flights;
    }

    @Step("{0} search Hotel")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.esClickable(TXT_CITY),
                Enter.theValue(flights.getOrigin()).into(TXT_CITY),
                Hit.the(Keys.ENTER).into(TXT_CITY),
                WaitFor.unTiempo(1000),
                WaitElement.esClickable(BTN_DATE),
                Click.on(BTN_DATE),
                WaitElement.esClickable(BTN_DATE_IN),
                Click.on(BTN_DATE_IN),
                Click.on(BTN_DATE_END),
                WaitElement.esClickable(BTN_APLICAR),
                Click.on(BTN_APLICAR),
                WaitFor.unTiempo(3000),
                WaitElement.esClickable(BTN_BUSCAR),
                Click.on(BTN_BUSCAR),
                WaitFor.unTiempo(10000)
        );
    }
    public static SearchAccomoding searchHotel(SearchFlightsModel flights) {
        return Tasks.instrumented(SearchAccomoding.class, flights);
    }
}

