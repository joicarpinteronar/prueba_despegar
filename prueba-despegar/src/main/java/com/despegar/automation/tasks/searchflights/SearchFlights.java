package com.despegar.automation.tasks.searchflights;

import com.despegar.automation.interactions.date.SelectDateOnCalendar;
import com.despegar.automation.interactions.waits.WaitElement;
import com.despegar.automation.interactions.waits.WaitFor;
import com.despegar.automation.models.searchflights.SearchFlightsModel;
import com.despegar.automation.userinterfaces.searchflights.SearchFlightsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static com.despegar.automation.userinterfaces.searchflights.SearchFlightsPage.*;
import static com.despegar.automation.utils.Constants.NUMBER_OF_DAYS;
import static com.despegar.automation.utils.Constants.NUMBER_OF_DAYS2;

public class SearchFlights implements Task {

    SearchFlightsModel flights;

    public SearchFlights(SearchFlightsModel flights) {
        this.flights = flights;
    }

    @Step("{0} search Flights")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.esClickable(TXT_ORIGIN),
                Enter.theValue(flights.getOrigin()).into(TXT_ORIGIN),
                Hit.the(Keys.ENTER).into(TXT_ORIGIN),
                WaitFor.unTiempo(1000),
                WaitElement.esClickable(TXT_DESTINATION),
                Enter.theValue(flights.getDestination()).into(TXT_DESTINATION).thenHit(Keys.ENTER),
                Hit.the(Keys.TAB).into(TXT_DESTINATION),
                DoubleClick.on(TXT_DESTINATION),
                WaitFor.unTiempo(2000),
                WaitElement.esClickable(SearchFlightsPage.BTN_DATE_DEPARTING),
                Click.on(SearchFlightsPage.BTN_DATE_DEPARTING),
                SelectDateOnCalendar.toScheduleServiceIn(NUMBER_OF_DAYS),
                SelectDateOnCalendar.toScheduleServiceIn(NUMBER_OF_DAYS2),
                WaitElement.esClickable(SearchFlightsPage.BTN_DONE_CALENDAR),
                Click.on(SearchFlightsPage.BTN_DONE_CALENDAR),
                WaitFor.unTiempo(2000),
                WaitElement.esClickable(SearchFlightsPage.BTN_SEARCH),
                Click.on(SearchFlightsPage.BTN_SEARCH),
                WaitFor.unTiempo(10000)
        );
    }
    public static SearchFlights searchFlights(SearchFlightsModel flights) {
        return Tasks.instrumented(SearchFlights.class, flights);
    }
}
