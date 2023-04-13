package com.despegar.automation.tasks.searchflights;

import com.despegar.automation.interactions.waits.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.despegar.automation.userinterfaces.searchflights.SearchHotelPage.BTN_ACCOMODATION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchHotel implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.esVisible(BTN_ACCOMODATION),
                Click.on(BTN_ACCOMODATION)
        );
    }

    public static SearchHotel goHotel() {
        return instrumented(SearchHotel.class);
    }
}
