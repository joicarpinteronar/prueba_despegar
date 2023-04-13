package com.despegar.automation.tasks.navigations;

import com.despegar.automation.interactions.waits.WaitElement;
import com.despegar.automation.interactions.waits.WaitFor;
import com.despegar.automation.userinterfaces.urls.Url;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.Presence;
import net.thucydides.core.annotations.Step;

import static com.despegar.automation.userinterfaces.searchflights.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate implements Task {

    Url url;

    @Step("{0} Navigations to a url ")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn().the(url)
        );
        if (!Presence.of(CLOSE_MODAL_SESION).viewedBy(actor).resolveAll().isEmpty()) {
            actor.attemptsTo(
                    WaitFor.unTiempo(3000),
                    WaitElement.esClickable(CLOSE_MODAL_SESION),
                    Click.on(CLOSE_MODAL_SESION)
            );
        } else if (!Presence.of(BTN_X).viewedBy(actor).resolveAll().isEmpty()) {
            actor.attemptsTo(
                    WaitFor.unTiempo(3000),
                    WaitElement.esClickable(BTN_X),
                    Click.on(BTN_X)
            );

        }
            actor.attemptsTo(
                    WaitElement.esVisible(BTN_COOKIES),
                    Click.on(BTN_COOKIES)
            );
    }
    public static Navigate openUrl() {
        return instrumented(Navigate.class);
    }
}
