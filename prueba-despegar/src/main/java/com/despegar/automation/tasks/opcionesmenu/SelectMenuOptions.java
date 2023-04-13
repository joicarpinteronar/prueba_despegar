package com.despegar.automation.tasks.opcionesmenu;

import com.despegar.automation.interactions.waits.WaitElement;
import com.despegar.automation.interactions.waits.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Presence;
import static com.despegar.automation.userinterfaces.menu.Menu.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SelectMenuOptions implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.esVisible(MENU_BUTTON),
                Click.on(MENU_BUTTON)
        );

        if (!Presence.of(MENU_OPTIONS).viewedBy(actor).resolveAll().isEmpty()) {
            actor.attemptsTo(
                    WaitFor.unTiempo(3000),
                    WaitElement.esClickable(MENU_OPTIONS),
                    Click.on(MENU_OPTIONS)
            );
        } else if (!Presence.of(OPTION2).viewedBy(actor).resolveAll().isEmpty()) {
            actor.attemptsTo(
                    WaitFor.unTiempo(3000),
                    WaitElement.esClickable(OPTION2),
                    Click.on(OPTION2)
            );

        }
    }

    public static SelectMenuOptions goMenu() {
        return instrumented(SelectMenuOptions.class);
    }
}