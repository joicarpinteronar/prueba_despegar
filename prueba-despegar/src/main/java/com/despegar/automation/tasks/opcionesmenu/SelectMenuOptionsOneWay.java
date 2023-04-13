package com.despegar.automation.tasks.opcionesmenu;

import com.despegar.automation.interactions.menu.SelectMenuOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static com.despegar.automation.utils.enums.MenuOptions.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelectMenuOptionsOneWay implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
             SelectMenuOption.selectMenu(FLIGHTS.getValue()).andSubmenu(ONEWAY.getValue()));
    }

    public static SelectMenuOptionsOneWay goMenuOneWay() {
        return instrumented(SelectMenuOptionsOneWay.class);
    }
}